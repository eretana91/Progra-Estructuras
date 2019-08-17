package Objectos;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
abstract class Persona {

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

}
