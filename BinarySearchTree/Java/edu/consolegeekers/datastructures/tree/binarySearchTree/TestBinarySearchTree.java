package edu.consolegeekers.datastructures.tree.binarySearchTree;

public class TestBinarySearchTree {
    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(15);
        bst.insert(10);
        bst.insert(1);
        bst.insert(13);
        bst.insert(20);
        bst.insert(11);
        bst.insert(17);
        bst.insert(70);
        bst.insert(56);
        bst.traverse();
        bst.delete(10);
        bst.traverse();
    }
}
