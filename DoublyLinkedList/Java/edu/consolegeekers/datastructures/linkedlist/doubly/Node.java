package edu.consolegeekers.datastructures.linkedlist.doubly;

public class Node {

    private int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
