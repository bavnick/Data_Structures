package edu.consolegeekers.datastructures.queue;

import java.util.*;

public class Queue {

    private List<Integer> queueList;

    public Queue(){
        queueList = new LinkedList();
    }

    public void enqueue(int data){
        queueList.add(data);
        System.out.println(data+" placed in queue");
    }

    public int dequeue(){
        if(queueList.size() <= 0)
            return -1;
        return queueList.remove(0);
    }
}
