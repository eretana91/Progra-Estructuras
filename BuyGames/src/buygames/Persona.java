package buygames;
/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class Persona {

    //Variables para Persona
    private static int personas[][];

    public static int[][] getUsers() {
        return personas;
    }

    public static void setUsers(int[][] aClientes) {
        personas = aClientes;
    }

    public static int[][] getClientes() {
        return personas;
    }

    public static void setClientes(int[][] aClientes) {
        personas = aClientes;
    }
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String cedula;

    public Persona(String nombre, String apellido, String direccion, String telefono, String email, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDirecion(String direcion) {
        this.direccion = direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
   

    @Override
    public String toString() {
        return "Nombre= " + nombre
                + "\nApellido: " + apellido
                + "\nDirecion: " + direccion
                + "\nTelefono: " + telefono
                + "\nEmail: " + email;
    }
}
