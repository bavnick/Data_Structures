package edu.consolegeekers.datastructures.linkedlist.simple;

public interface LinkedList {

    public void insertAtStart(int data);
    public void insertAtEnd(int data);
    public void insertAtIndex(int data, int index);
    public void traverse();
    public void deleteAtStart();
    public void deleteAtEnd();
    public void deleteAtIndex(int index);
    public int get(int index);

}
