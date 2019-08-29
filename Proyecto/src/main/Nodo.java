package main;

public class Nodo {

    //==== ATRIBUTOS ====//
    int dato;
    Nodo siguiente;

    //==== CONSTRUCTOR ====//
    public Nodo() {
        this.dato = 0;
        this.siguiente = null;
    }

    //==== METODOS ====//
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
