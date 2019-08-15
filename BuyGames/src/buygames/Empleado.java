package buygames;
/**
 *
 * @author erick.retana
 */
public class Empleado extends Persona {

    String username;
    String password;

    public Empleado(String username, String password, String nombre, String apellido, String direccion, String telefono, String email, String cedula) {
        super(nombre, apellido, direccion, telefono, email, cedula);
        this.username = username;
        this.password = password;
    }

}
