package buygames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class BuyGames {

    private final String URL = "jdbc:jtds:sqlserver://localhost;Database=buygames;instance=sqlexpress;useNTLMv2=tru‌​e;domain=workgroup";;
    private final String USER = "buygames";
    private final String PASS = "Temporal123456789";
    private static ResultSet RESULT;

    public static void main(String[] args) {

        //Llamado a la primer ventana de Login
        VentanaLogin frame = new VentanaLogin();
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //inicio de coneccion SQL
        new BuyGames().startSQL();
    }

    private void startSQL() {
        System.out.println("START SQL");
        String query = "SELECT * FROM logindata";
        getData(query);
        System.out.println("END");
    }

    public ResultSet getData(String query) {
        Connection CON;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            CON = DriverManager.getConnection(URL, USER, PASS);
            RESULT = CON.createStatement().executeQuery(query);
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return RESULT;
    }
}
