package com.algorithms.searching;

import com.implementation.tree.MyBinarySearchTree;
import com.implementation.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static List<Integer> depthFirstSearchInOrder(TreeNode node, List<Integer> list) {
        if(node.left!=null){
            depthFirstSearchInOrder(node.left, list);
        }
        list.add(node.value);

        if(node.right!=null) {
            depthFirstSearchInOrder(node.right, list);
        }
        return list;
    }

    public static List<Integer> depthFirstSearchPostOrder(TreeNode node, List<Integer> list) {
        if(node.left!=null){
            depthFirstSearchPostOrder(node.left, list);
        }
        if(node.right!=null) {
            depthFirstSearchPostOrder(node.right, list);
        }
        list.add(node.value);
        return list;
    }

    public static List<Integer> depthFirstSearchPreOrder(TreeNode node, List<Integer> list) {
        list.add(node.value);

        if(node.left!=null){
            depthFirstSearchPreOrder(node.left, list);
        }
        if(node.right!=null) {
            depthFirstSearchPreOrder(node.right, list);
        }
        return list;
    }

    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        List<Integer> list = new ArrayList<>();
        System.out.println("*********DFS Traversal*******");

        System.out.println("------In Order Traversal------");
        depthFirstSearchInOrder(tree.root, list).forEach(n-> System.out.print(n + " "));

        List<Integer> list1 = new ArrayList<>();
        System.out.println();
        System.out.println("------Pre Order Traversal------");
        depthFirstSearchPreOrder(tree.root, list1).forEach(n-> System.out.print(n + " "));

        List<Integer> list2 = new ArrayList<>();
        System.out.println();
        System.out.println("------Post Order Traversal------");
        depthFirstSearchPostOrder(tree.root, list2).forEach(n-> System.out.print(n + " "));
    }
}
