package com.algorithms.searching;

import com.implementation.tree.MyBinarySearchTree;
import com.implementation.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Breadth First Search
public class BFS {

    // O(N)
    public static List<Integer> breadthFirstSearch(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode currentNode = node;
        while(currentNode!=null) {
            list.add(currentNode.value);
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
            currentNode = queue.poll();
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
        tree.printTree();

        System.out.println("*********BFS Traversal*******");
        breadthFirstSearch(tree.root).forEach(n-> System.out.print(n + " "));
    }
}
