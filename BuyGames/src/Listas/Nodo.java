package Listas;

import Objectos.VideoJuegos;

public class Nodo {

    // Variable en la cual se va a guardar el valor.
    private VideoJuegos valor;

    // Variable para enlazar los nodos. Puntero.
    private Nodo siguiente;
    private Nodo anterior;

    public void Nodo() {
        this.valor = null;
        this.siguiente = null;
        this.anterior = null;
    }

    // Métodos get y set para los atributos.
    public VideoJuegos getValor() {
        return valor;
    }

    public void setValor(VideoJuegos valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}