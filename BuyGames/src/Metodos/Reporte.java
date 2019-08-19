
package Metodos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author erick.retana
 */
public class Reporte {
    
    public static void crearExcel() throws FileNotFoundException, IOException{
        
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Empleados");
        
        
        //InputStream is = Main.class.getResourceAsStream("Pictures//Icons//logo.jpg");
        //BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        //byte[] bytes = IOUtils.toByteArray(is);
        //int imgIndex = book.addPicture(bytes,Workbook.PICTURE_TYPE_JPEG);
        //is.close();
        
        CreationHelper help = book.getCreationHelper();
        Drawing draw = sheet.createDrawingPatriarch();
        
        ClientAnchor anchor = help.createClientAnchor();
        anchor.setCol1(0);
        anchor.setRow1(1);
       // Picture pict = draw.createPicture(anchor, imgIndex);
       // pict.resize(3,1);
        
        FileOutputStream fileOut = new FileOutputStream("Reporte.xlsx");
        book.write(fileOut);
        fileOut.close();
        
    }
    
}
