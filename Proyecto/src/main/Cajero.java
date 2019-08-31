package main;

public class Cajero extends Thread {

    Colas colas = new Colas();

    public void run() {
        colas.extraer();
    }
}
