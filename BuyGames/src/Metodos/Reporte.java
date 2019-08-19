package Metodos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
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
public class Reporte extends Thread {

    @SuppressWarnings("empty-statement")
    public static void crearExcelEmpleados() throws FileNotFoundException, IOException, SQLException {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Empleados");

        //Codigo para agregar logo en excel
        InputStream is = Main.class.getResourceAsStream("/Pictures/Icons/logo.jpg");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        byte[] bytes = IOUtils.toByteArray(is);
        int imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
        is.close();

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
        celdaTitulo.setCellValue("Reporte Empleados");

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
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = conexion.dataSource.getConnection();
        int numfilaDatos = 5;
        String SSQL = "SELECT id, nombre, apellido, correo, direccion, cedula, telefono FROM empleados";

        ps = conn.prepareStatement(SSQL);
        rs = ps.executeQuery();

        int numCol = rs.getMetaData().getColumnCount();

        while (rs.next());
        {
            Row filaDatos = sheet.createRow(numfilaDatos);
            for (int a = 0; a < numCol; a++) {
                Cell CelDatos = filaDatos.createCell(a);
                CelDatos.setCellStyle(dataStyle);
                CelDatos.setCellValue(rs.getString((a + 1)));

                numfilaDatos++;
            }
        }

        FileOutputStream fileOut = new FileOutputStream("ReporteEmpleados.xlsx");
        book.write(fileOut);
        fileOut.close();

    }
    
       @SuppressWarnings("empty-statement")
    public static void crearExcelClientes() throws FileNotFoundException, IOException, SQLException {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Clientes");

        //Codigo para agregar logo en excel
        InputStream is = Main.class.getResourceAsStream("/Pictures/Icons/logo.jpg");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        byte[] bytes = IOUtils.toByteArray(is);
        int imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
        is.close();

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
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = conexion.dataSource.getConnection();
        int numfilaDatos = 5;
        String SSQL = "SELECT id, nombre, apellido, correo, direccion, cedula, telefono FROM clientes";

        ps = conn.prepareStatement(SSQL);
        rs = ps.executeQuery();

        int numCol = rs.getMetaData().getColumnCount();

        while (rs.next());
        {
            Row filaDatos = sheet.createRow(numfilaDatos);
            for (int a = 0; a < numCol; a++) {
                Cell CelDatos = filaDatos.createCell(a);
                CelDatos.setCellStyle(dataStyle);
                CelDatos.setCellValue(rs.getString((a + 1)));

                numfilaDatos++;
            }
        }

        FileOutputStream fileOut = new FileOutputStream("ReporteClientes.xlsx");
        book.write(fileOut);
        fileOut.close();

    }

}
