package edu.consolegeekers.datastructures.linkedlist.simple;

public class SimpleLinkedList implements LinkedList{

    private Node head;

    @Override
    public void insertAtStart(int data){
        Node node = new Node(data);
        if(head == null) {
            //If no head, make new element as head
            head = node;
        }else {
            //We make new node as head
            node.next = head;
            head = node;
        }
    }

    @Override
    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null) {
            //If no head, make new element as head
            head = node;
        }else{
            //If head is present, traverse till the end and add new node.
            Node refNode = head;
            while(refNode.next != null){
                refNode = refNode.next;
            }
            refNode.next = node;
        }
    }

    @Override
    public void insertAtIndex(int data, int index) {
        Node node = new Node(data);
        if(head == null){
            // if head is null, we can insert only at index 0
            if(index == 0)
                head = node;
            else
                throw new ArrayIndexOutOfBoundsException("Index "+index+" is out of bound");
        }
        Node refNode = head;
        // Traverse till last element from index
        while(refNode.next != null && index > 1){
            refNode = refNode.next;
            --index;
        }
        if(refNode == null)
            throw new ArrayIndexOutOfBoundsException("Index "+index+" is out of bound");
        //Make next of node as refNode next
        node.next = refNode.next;
        //Make refNode next as new Node
        refNode.next = node;
    }

    @Override
    public void traverse(){
        Node refNode = head;
        while(refNode != null){
            System.out.print(refNode.getData()+" ");
            refNode = refNode.next;
        }
        System.out.println();
    }

    @Override
    public void deleteAtStart() {
        //Nothing to delete if head is null
        if(head == null)
            return;
        //Make head as head.next
        head = head.next;
    }

    @Override
    public void deleteAtEnd() {
        //Nothing to delete if head is null
        if(head == null)
            return;
        //if head.next is null
        //Means only head is present, so we need to delete head
        if(head.next == null) {
            head = null;
            return;
        }
        //Now we know there are 2 elements in the list as head.next is not null
        //lets make prev as head and refNode as head.next and start traversing
        Node prev = head;
        Node refNode = head.next;
        //traverse till last node
        //In this case, we need to store ref to secondLastNode too
        //So we can make it
        while(refNode.next!=null){
            prev = refNode;
            refNode = refNode.next;
        }
        //now we would have reached the end
        //lets make prev.next as null, which is the second last element
        prev.next = null;
    }

    @Override
    public void deleteAtIndex(int index) {
        Node refNode = head;
        //Traverse till index become 2, which is second last from that index
        while(refNode.next != null && index > 2){
            refNode = refNode.next;
            --index;
        }
        //As refNode is second last from the index
        //refNode.next is the node to delete, so if that is null, it means index out of bound
        if(refNode == null || refNode.next == null)
            throw new ArrayIndexOutOfBoundsException("Index "+index+" is out of bound");
        //Make next of refnode as next -> next
        // this remove the node from the list
        refNode.next = refNode.next.next;
    }

    @Override
    public int get(int index){
        // Get reference to the head first
        Node node = head;
        //continue until index is 0 or node is null
        //if node become null then index is out of bound
        while(index > 0 && node != null){
            node = node.next;
            --index;
        }
        if(node != null)
            return node.getData();
        else
            throw new ArrayIndexOutOfBoundsException("Index "+index+" is out of bound");
    }

}
