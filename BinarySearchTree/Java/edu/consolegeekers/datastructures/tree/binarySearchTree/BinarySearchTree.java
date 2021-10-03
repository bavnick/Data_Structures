package edu.consolegeekers.datastructures.tree.binarySearchTree;

public class BinarySearchTree implements Tree{

    Node root;

    @Override
    public void insert(int data) {
        Node node = new Node(data);
        // If root node is null, make new node as root node
        if(root == null)
            root = node;
        else{
            // we need to find optimal place for our node.
            insertNodeIntoTree(root, node);
        }
    }

    private void insertNodeIntoTree(Node parent,Node node){
        if(node.getData() < parent.getData()){
            // if value is less than current node left, we can place the value in left sub tree
            if(parent.left == null) {
                parent.left = node;
            }else{
                insertNodeIntoTree(parent.left, node);
            }
        }else{
            // if value is less than current node left, we can place the value in right sub tree
            if(parent.right == null){
                parent.right = node;
            }else{
                insertNodeIntoTree(parent.right, node);
            }
        }
    }

    @Override
    public void delete(int data) {
        deleteData(root, data);
    }

    private Node deleteData(Node parent, int valueToDelete){
        if(parent.getData() == valueToDelete){
            if(parent.left == null && parent.right == null){
                // both left and right are null, which means node is leaf node and we can just set it as null
                return null;
            }
            else if(parent.left == null){
                //only one child node replace with child node.
                return parent.right;
            }
            else if(parent.right == null){
                //only one child node replace with child node.
                return parent.left;
            }
            else{
                Node inorderSuccessor = getInorderSuccessor(parent.right);
                parent.setData(inorderSuccessor.getData());
                deleteData(parent.right, inorderSuccessor.getData());
                return parent;
            }
        }
        if(valueToDelete < parent.getData()){
            parent.left = deleteData(parent.left, valueToDelete);
        }else{
            parent.right = deleteData(parent.right, valueToDelete);
        }
        return parent;
    }

    private Node getInorderSuccessor(Node node){
        // just get the left most leaf node, that's the inorder successor
        if(node.left == null) {
            return node;
        }
        return getInorderSuccessor(node.left);
    }

    @Override
    public void traverse() {
        System.out.println("Inorder Traversal");
        traverseInorder(root);
        System.out.println();
        System.out.println("Preorder Traversal");
        traversePreorder(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        traversePostorder(root);
        System.out.println();
    }

    private void traverseInorder(Node node){
        // left, parent, right
        if(node == null)
            return;
        traverseInorder(node.left);
        System.out.print(node.getData() + " ");
        traverseInorder(node.right);
    }

    private void traversePreorder(Node node){
        // parent, left, right
        if(node == null)
            return;
        System.out.print(node.getData() + " ");
        traversePreorder(node.left);
        traversePreorder(node.right);
    }

    private void traversePostorder(Node node){
        // left, right, parent
        if(node == null)
            return;
        traversePostorder(node.left);
        traversePostorder(node.right);
        System.out.print(node.getData() + " ");
    }

}
