package Metodos;

import Formularios.Login;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class Main {

    public static void main(String[] args) {

        //Llamado a la primer ventana de Login
        Login frame = new Login();
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
