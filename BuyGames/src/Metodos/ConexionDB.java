package Metodos;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
/**
 *
 * @author erick.retana
 */
public class ConexionDB {

    public DataSource dataSource;
    public String db = "buygames";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "dbconect";
    public String pass = "Temporal123456789";

    public ConexionDB() {

        inicializaDataSource();

    }

    private void inicializaDataSource() {

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);
        dataSource = basicDataSource;

    }
}