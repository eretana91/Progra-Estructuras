package Metodos;

import Formularios.Login;
import java.io.IOException;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //Llamado a la primer ventana de Login
        Login frame = new Login();
        frame.setSize(820,580);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Reporte.crearExcel();
     
    }

}
