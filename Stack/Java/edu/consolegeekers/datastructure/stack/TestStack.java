package edu.consolegeekers.datastructure.stack;

public class TestStack {

    public static void main(String args[]){
        Stack stack = new Stack();
        System.out.println("Push Operations");
        stack.push(4);
        stack.push(9);
        stack.push(10);
        stack.push(1);
        System.out.println("Pop Operations");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
