package buygames;
/**
 *
 * @author Erick Retana Sánchez
 * 
 **/
public class BuyGames {  
    public static void main(String[] args) {
        
        //Llamado a la primer ventana de Login
        login frame = new login();
        frame.setSize(800,650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }    
}
