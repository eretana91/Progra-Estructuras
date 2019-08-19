package Metodos;

import Formularios.Login;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException {

        //Llamado a la primer ventana de Login
        Login frame = new Login();
        frame.setSize(820,580);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Reporte.crearExcelClientes();
        Reporte.crearExcelEmpleados();
     
    }

}
