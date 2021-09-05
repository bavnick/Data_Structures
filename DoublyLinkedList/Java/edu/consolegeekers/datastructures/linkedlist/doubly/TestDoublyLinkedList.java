package edu.consolegeekers.datastructures.linkedlist.doubly;

public class TestDoublyLinkedList {

    public static void main(String args[]){

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        // lets create a linked List, will 4, 15, 1 and 6
        doublyLinkedList.insertAtStart(15);
        doublyLinkedList.traverse();
        doublyLinkedList.insertAtStart(4);
        doublyLinkedList.traverse();
        doublyLinkedList.insertAtEnd(6);
        doublyLinkedList.traverse();
        doublyLinkedList.insertAtIndex(1, 2);
        doublyLinkedList.traverse();

        // lets try delete now
        doublyLinkedList.deleteAtIndex(1);
        doublyLinkedList.traverse();
        doublyLinkedList.deleteAtEnd();
        doublyLinkedList.traverse();
        doublyLinkedList.deleteAtStart();
        doublyLinkedList.traverse();

        // lets add 2 more elements and get element at 1
        doublyLinkedList.insertAtStart(4);
        doublyLinkedList.traverse();
        doublyLinkedList.insertAtEnd(6);
        doublyLinkedList.traverse();
        System.out.println(doublyLinkedList.get(2));
    }
}
