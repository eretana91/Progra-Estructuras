package Objectos;

/**
 *
 * @author erick.retana
 */
public class Empleado extends Persona {

    private String username;
    private String password;

    public Empleado(String username, String password, String nombre, String apellido, String direccion, String telefono, String email, String cedula) {
        super(nombre, apellido, direccion, telefono, email, cedula);
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    

}
