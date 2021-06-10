package com.bridgelabz;

public class MyNode<T> {
    private MyNode next;
    private T key;

    public MyNode(T key) {
        this.key = null;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}