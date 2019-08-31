package main;

import java.awt.Color;

public class Cajero extends Thread {

    int time = 0;
    int id = 0;
    Colas cola = null;

    public Cajero(Colas cola, int id) {
        this.cola = cola;
        this.id = id;
    }

    public void run() {
        pintarCajeros();
        atender();
    }

    public void atender() {
        do {
            switch (id) {
                case 1:
                    try {
                        if (cola.vacia()) {
                            System.out.println("No hay clientes en fila");
                            principal.Jlabel_cajero_1.setBackground(Color.GREEN);
                            cola.pintarCola();
                        } else {
                            time = cola.extraer();
                            cola.pintarCola();
                            principal.Jlabel_cajero_1.setBackground(Color.RED);
                            Thread.sleep(time * 1000);
                            principal.Jlabel_cajero_1.setBackground(Color.GREEN);
                            Thread.sleep(4000);
                            if (!cola.vacia()) {
                                atender();
                            }
                        }

                    } catch (Exception e) {
                    }
                    break;
                case 2:
                    try {
                        if (cola.vacia()) {
                            System.out.println("No hay clientes en fila");
                            principal.Jlabel_cajero_2.setBackground(Color.GREEN);
                            cola.pintarCola();
                        } else {
                            time = cola.extraer();
                            cola.pintarCola();
                            principal.Jlabel_cajero_2.setBackground(Color.RED);
                            Thread.sleep(time * 1000);
                            principal.Jlabel_cajero_2.setBackground(Color.GREEN);
                            Thread.sleep(4000);
                            if (!cola.vacia()) {
                                atender();
                            }
                        }

                    } catch (Exception e) {
                    }
                    break;
                case 3:
                    try {
                        if (cola.vacia()) {
                            System.out.println("No hay clientes en fila");
                            principal.Jlabel_cajero_3.setBackground(Color.GREEN);
                            cola.pintarCola();

                        } else {
                            time = cola.extraer();
                            cola.pintarCola();
                            principal.Jlabel_cajero_3.setBackground(Color.RED);
                            Thread.sleep(time * 1000);
                            principal.Jlabel_cajero_3.setBackground(Color.GREEN);
                            Thread.sleep(4000);
                            if (!cola.vacia()) {
                                atender();
                            }
                        }

                    } catch (Exception e) {
                    }
                    break;
            }
        } while (true);

    }

    public void pintarCajeros() {
        principal.Jlabel_cajero_1.setBackground(Color.GREEN);
        principal.Jlabel_cajero_2.setBackground(Color.GREEN);
        principal.Jlabel_cajero_3.setBackground(Color.GREEN);
    }

}
