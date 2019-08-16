package Metodos;

import Formularios.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author erick.retana
 */
public class MetodosLogin {

    PoolMySQL metodospool = new PoolMySQL();
    
    public int validarIngreso(){
        String usuario = Login.JTextUsername.getText();
        String clave = String.valueOf(Login.JTextPassword.getPassword());
        System.out.println(usuario);
        System.out.println(clave);
        
        int resultado = 0;
        
        String SSQL = "SELECT * FROM usuarios WHERE usuario= '"+usuario+"' AND clave='"+clave+"'"; 
        System.out.println(SSQL);
        Connection conect = null;
        
        try {
            conect = metodospool.dataSource.getConnection();
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SSQL);
            
            if(rs.next()){
                resultado=1;
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex,"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }finally{    
        }
        try {
            conect.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error de desconexión",JOptionPane.ERROR_MESSAGE);
    }
    return resultado;
}
}
