package Listas;

import Objectos.Cliente;

public class Nodo {

    // Variable en la cual se va a guardar el valor.
    private Cliente valor;

    // Variable para enlazar los nodos. Puntero.
    private Nodo siguiente;
    private Nodo anterior;

    public void Nodo() {
        this.valor = null;
        this.siguiente = null;
        this.anterior = null;
    }

    // Métodos get y set para los atributos.
    public Cliente getValor() {
        return valor;
    }

    public void setValor(Cliente valor) {
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