package edu.consolegeekers.datastructures.tree.binarySearchTree;

public class Node {

    private int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
