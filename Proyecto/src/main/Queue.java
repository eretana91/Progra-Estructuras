package main;

import javax.swing.JOptionPane;

public class Queue {

    public Node top;
    public int counter;

    public Queue() {
        this.top = null;
        this.counter = 0;
    }

    public boolean isEmpty() {
        boolean flag;
        flag = false;
        if (top == null) {
            flag = true;
        }
        return flag;
    }

    public void add(int value) {
        Node recent;
        recent = new Node();
        recent.setValue(value);

        if (counter == 6) {
            JOptionPane.showMessageDialog(null, "No hay espacio en la sucursal, por favor intentelo más tarde", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (isEmpty()) {
            top = recent;
            counter++;
        } else {
            Node aux = top;
            while (aux != null) {
                aux.next();
            }
            aux.setNext(recent);
            counter++;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes en la cola", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        } else {
            Node aux = top;
            top = top.next();
            aux.setNext(null);
            counter--;
            return aux.getValue();
        }
    }

    public void review() {
        Node aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + "\n");
            aux = aux.next();
        }
    }

}
