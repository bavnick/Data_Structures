package edu.consolegeekers.datastructure.stack;

public class OptimizedStack {

    private class StackNode{
        public int data;
        public StackNode prev, next;

        StackNode(int data){
            this.data = data;
        }
    }

    private StackNode head, tail;

    public void push(int data){
        StackNode node = new StackNode(data);
        if(head == null){
            head = node;
        }
        if(tail != null){
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        System.out.println(data+" placed in stack");
    }

    public int pop(){
        if(tail != null){
            int data = tail.data;
            tail = tail.prev;
            return data;
        }
        return -1;
    }

}
