package buygames;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class Cliente {

    //Variables para Cliente
    private static int clientes[][];

    public static int[][] getUsers() {
        return clientes;
    }

    public static void setUsers(int[][] aClientes) {
        clientes = aClientes;
    }

    public static int[][] getClientes() {
        return clientes;
    }

    public static void setClientes(int[][] aClientes) {
        clientes = aClientes;
    }
    private String fullName;
    private String address;
    private String phone;
    private String email;

    public Cliente(String fullName, String address, String phone, String email) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FullName= " + fullName
                + "\nAddress= " + address
                + "\nPhone= " + phone
                + "\nEmail= " + email;
    }
}
