package com.implementation.tree;

public class MyBinarySearchTree {
    TreeNode root;
    int size;

    MyBinarySearchTree() {
        this.root = null;
        this.size = 3;
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            size++;
        } else {
            TreeNode currentNode = root;
            while (true) {
                if (value < currentNode.value) {
                    if(currentNode.left==null) {
                        currentNode.left = newNode;
                        size++;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    if(currentNode.right==null) {
                        currentNode.right = newNode;
                        size++;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public boolean lookup(int value) {
        if (root == null) {
            return false;
        }
        TreeNode currentNode = root;
        while (currentNode != null) {
            if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value == currentNode.value) {
                return true;
            }
        }
        return false;
    }

    public void remove() {
    }

    public void printTree() {
        System.out.println(root);
    }

    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.printTree();
//        tree.insert(170);
//        tree.insert(15);
//        tree.insert(1);

        System.out.println(tree.lookup(20));
    }

    //       9
    //    4     20
    //  1  6  15  170
}
