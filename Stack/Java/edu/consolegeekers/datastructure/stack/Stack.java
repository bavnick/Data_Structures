package edu.consolegeekers.datastructure.stack;

import java.util.*;

public class Stack {

    private List<Integer> list;

    public Stack(){
        list = new ArrayList<>();
    }

    public void push(int data){
        list.add(data);
        System.out.println(data+" placed in stack");
    }

    public int pop(){
        if(list.size() == 0)
            return -1;
        return list.remove(list.size()-1);
    }

}
