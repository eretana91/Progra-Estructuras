package main;

public class Nodo {

    private int value;
    private Nodo next;

    public void Nodo(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo next() {
        return next;
    }

    public void setNext() {
        this.next = next;
    }

}
