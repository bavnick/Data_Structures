package edu.consolegeekers.datastructures;

public class TestSimpleLinkedList {

    public static void main(String args[]){

        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        // lets create a linked List, will 4, 15, 1 and 6
        simpleLinkedList.insertAtStart(15);
        simpleLinkedList.traverse();
        simpleLinkedList.insertAtStart(4);
        simpleLinkedList.traverse();
        simpleLinkedList.insertAtEnd(6);
        simpleLinkedList.traverse();
        simpleLinkedList.insertAtIndex(1, 2);
        simpleLinkedList.traverse();

        // lets try delete now
        simpleLinkedList.deleteAtIndex(1);
        simpleLinkedList.traverse();
        simpleLinkedList.deleteAtEnd();
        simpleLinkedList.traverse();
        simpleLinkedList.deleteAtStart();
        simpleLinkedList.traverse();

        // lets add 2 more elements and get element at 1
        simpleLinkedList.insertAtStart(4);
        simpleLinkedList.traverse();
        simpleLinkedList.insertAtEnd(6);
        simpleLinkedList.traverse();
        System.out.println(simpleLinkedList.get(2));
        //simpleLinkedList.traverse();
    }

}
