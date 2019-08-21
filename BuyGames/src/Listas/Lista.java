package Listas;

import Objectos.VideoJuegos;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int tamanio;

    public void Lista() {
        inicio = null;
        fin = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(VideoJuegos valor) {

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamanio++;
    }

    public void agregarAlInicio(VideoJuegos valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

}
