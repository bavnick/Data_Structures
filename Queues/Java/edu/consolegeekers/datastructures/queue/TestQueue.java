package edu.consolegeekers.datastructures.queue;

public class TestQueue {

    public static void main(String args[]){
        Queue queue = new Queue();
        System.out.println("Enqueue Operations");
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(1);
        System.out.println("Dequeue Operations");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
