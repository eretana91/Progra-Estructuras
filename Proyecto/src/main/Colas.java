package main;

import javax.swing.JOptionPane;

public class Colas {

    private Nodo inicio, fondo, aux;
    public int tamanio; 

    public Colas() {
        inicio = null;
        fondo = null;
        aux = null;
    }

    public boolean vacia() {
       return inicio == null;
    }

    void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.dato = info;
        nuevo.siguiente = null;

        if (vacia()) {
            inicio = nuevo;
            fondo = nuevo;
            tamanio++;
        } else {
            fondo.siguiente = nuevo;
            fondo = nuevo;
            tamanio++;
        }
    }

    int extraer() {
        if (!vacia()) {
            int informacion = inicio.dato;
            if (inicio == fondo) {
                inicio = null;
                fondo = null;
            } else {
                inicio = inicio.siguiente;
            }
            System.out.println(informacion);
            tamanio--;
            return informacion;
           
        } else {
            System.out.println("0");
            return 0;
            
        }
    }

    public void imprimir() {
        Nodo reco = inicio;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco != null) {
            System.out.print(reco.dato + "->");
            reco = reco.siguiente;
        }
        System.out.println();
    }
}
