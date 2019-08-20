/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author erick.retana
 */
public class ReporteClientes extends Thread {
    
    @Override
    public void run() {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Clientes");

        //Codigo para agregar logo en excel
        InputStream is = Main.class.getResourceAsStream("/Pictures/Icons/logo.jpg");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        byte[] bytes = null;
        try {
            bytes = IOUtils.toByteArray(is);
        } catch (IOException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        int imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
        try {
            is.close();
        } catch (IOException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        CreationHelper help = book.getCreationHelper();
        Drawing draw = sheet.createDrawingPatriarch();

        ClientAnchor anchor = help.createClientAnchor();
        anchor.setCol1(0);
        anchor.setRow1(1);
        Picture pict = draw.createPicture(anchor, imgIndex);
        pict.resize(3, 2);

        //Estilo del Titulo
        CellStyle tituloEstilo = book.createCellStyle();
        tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
        tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
        Font fuenteTitulo = book.createFont();
        fuenteTitulo.setFontName("Arial");
        fuenteTitulo.setBold(true);
        fuenteTitulo.setFontHeightInPoints((short) 14);
        tituloEstilo.setFont(fuenteTitulo);

        Row filaTitulo = sheet.createRow(1);
        Cell celdaTitulo = filaTitulo.createCell(3);
        celdaTitulo.setCellStyle(tituloEstilo);
        celdaTitulo.setCellValue("Reporte Clientes");

        sheet.addMergedRegion(new CellRangeAddress(1, 2, 3, 5));

        //Encabezado del reporte
        String[] cabecera = new String[]{"id", "Nombre", "Apellido", "Correo", "Direccion", "Cedula", "Telefono"};

        CellStyle headerStyle = book.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerStyle.setBorderBottom(BorderStyle.THIN);
        headerStyle.setBorderLeft(BorderStyle.THIN);
        headerStyle.setBorderRight(BorderStyle.THIN);
        headerStyle.setBorderTop(BorderStyle.THIN);

        Font fuenteCabecera = book.createFont();
        fuenteCabecera.setFontName("Arial");
        fuenteCabecera.setBold(true);
        fuenteCabecera.setColor(IndexedColors.WHITE.getIndex());
        fuenteCabecera.setFontHeightInPoints((short) 12);
        headerStyle.setFont(fuenteCabecera);

        Row filaEncabezados = sheet.createRow(4);

        for (int i = 0; i < cabecera.length; i++) {
            Cell celdaEncabezado = filaEncabezados.createCell(i);
            celdaEncabezado.setCellStyle(headerStyle);
            celdaEncabezado.setCellValue(cabecera[i]);
        }
        //Estilo de celdas de datos
        CellStyle dataStyle = book.createCellStyle();
        dataStyle.setBorderBottom(BorderStyle.THIN);
        dataStyle.setBorderLeft(BorderStyle.THIN);
        dataStyle.setBorderRight(BorderStyle.THIN);
        dataStyle.setBorderTop(BorderStyle.THIN);
        //Conexion a base de datos
        ConexionDB conexion = new ConexionDB();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conect = null;
        try {
            conect = conexion.dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        int numfilaDatos = 5;
        String SSQL = "SELECT * FROM clientes";

        try {
            ps = conect.prepareStatement(SSQL);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        int numCol = 0;
        try {
            numCol = rs.getMetaData().getColumnCount();
        } catch (SQLException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            do{
                Row filaDatos = sheet.createRow(numfilaDatos);
                for (int a = 1; a <= numCol; a++) {
                    Cell CelDatos = filaDatos.createCell(a-1);
                    CelDatos.setCellStyle(dataStyle);
                    try {
                        CelDatos.setCellValue(rs.getString(a));
                    } catch (SQLException ex) {
                        Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }numfilaDatos++;
                
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("C:\\ReportesBuyGames\\ReporteClientes"+LocalDate.now()+".xlsx");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            book.write(fileOut);
        } catch (IOException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fileOut.close();
        } catch (IOException ex) {
            Logger.getLogger(ReporteClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
         try{
          Runtime.getRuntime().exec("cmd /c start C:\\ReportesBuyGames\\ReporteClientes"+LocalDate.now()+".xlsx");
          }catch(IOException  e){
              e.printStackTrace();
          }

    }
}
