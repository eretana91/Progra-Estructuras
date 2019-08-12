package buygames;
/**
 *
 * @author Erick Retana Sánchez
 * 
 **/
public class Cart {

    //Variables para carrito de compras
    private double ahorro;
    private int cantidad;
    private double total;
    
    //Constructor de Cart
    public Cart(double ahorro, int cantidad, double total) {
        this.ahorro = ahorro;
        this.cantidad = cantidad;
        this.total = total;
    }

    //Get & Set de Cart
    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Precio= " + ahorro + "\nCantidad= " + cantidad + "\nTotal= " + total;
    }   
}
