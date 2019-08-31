package main;

import java.awt.Color;
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

    public void pintarCola() {

        switch (tamanio) {
            
                
            case 1:
                principal.jPanel_pos_1.setBackground(Color.GREEN);
                principal.jPanel_pos_2.setBackground(Color.GRAY);
                principal.jPanel_pos_3.setBackground(Color.GRAY);
                principal.jPanel_pos_4.setBackground(Color.GRAY);
                principal.jPanel_pos_5.setBackground(Color.GRAY);
                principal.jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 2:
                principal.jPanel_pos_1.setBackground(Color.GREEN);
                principal.jPanel_pos_2.setBackground(Color.GREEN);
                principal.jPanel_pos_3.setBackground(Color.GRAY);
                principal.jPanel_pos_4.setBackground(Color.GRAY);
                principal.jPanel_pos_5.setBackground(Color.GRAY);
                principal.jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 3:
                principal.jPanel_pos_1.setBackground(Color.GREEN);
                principal.jPanel_pos_2.setBackground(Color.GREEN);
                principal.jPanel_pos_3.setBackground(Color.GREEN);
                principal.jPanel_pos_4.setBackground(Color.GRAY);
                principal.jPanel_pos_5.setBackground(Color.GRAY);
                principal.jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 4:
                principal.jPanel_pos_1.setBackground(Color.GREEN);
                principal.jPanel_pos_2.setBackground(Color.GREEN);
                principal.jPanel_pos_3.setBackground(Color.GREEN);
                principal.jPanel_pos_4.setBackground(Color.GREEN);
                principal.jPanel_pos_5.setBackground(Color.GRAY);
                principal.jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 5:
                principal.jPanel_pos_1.setBackground(Color.GREEN);
                principal.jPanel_pos_2.setBackground(Color.GREEN);
                principal.jPanel_pos_3.setBackground(Color.GREEN);
                principal.jPanel_pos_4.setBackground(Color.GREEN);
                principal.jPanel_pos_5.setBackground(Color.GREEN);
                principal.jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 6:
                principal.jPanel_pos_1.setBackground(Color.GREEN);
                principal.jPanel_pos_2.setBackground(Color.GREEN);
                principal.jPanel_pos_3.setBackground(Color.GREEN);
                principal.jPanel_pos_4.setBackground(Color.GREEN);
                principal.jPanel_pos_5.setBackground(Color.GREEN);
                principal.jPanel_pos_6.setBackground(Color.GREEN);
                break;
                
            case 7:
                System.out.println("No hay espacios disponibles");
            default:
                
                principal.jPanel_pos_1.setBackground(Color.GRAY);
                principal.jPanel_pos_2.setBackground(Color.GRAY);
                principal.jPanel_pos_3.setBackground(Color.GRAY);
                principal.jPanel_pos_4.setBackground(Color.GRAY);
                principal.jPanel_pos_5.setBackground(Color.GRAY);
                principal.jPanel_pos_6.setBackground(Color.GRAY);

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

    public void pintarInfinito() {
        do {
            pintarCola();
        } while (true);

    }
}
