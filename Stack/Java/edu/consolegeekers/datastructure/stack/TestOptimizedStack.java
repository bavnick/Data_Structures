package edu.consolegeekers.datastructure.stack;

public class TestOptimizedStack {

    public static void main(String args[]){
        OptimizedStack stack = new OptimizedStack();
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
