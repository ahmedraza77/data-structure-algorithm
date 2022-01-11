package com.problems.trees;

import com.implementation.tree.TreeNode;

public class ValidateBST {
    TreeNode prev;

    public static void main(String[] args) {
        ValidateBST obj = new ValidateBST();

        TreeNode root = new TreeNode(5);  // Root
        TreeNode l1 = new TreeNode(1);
        TreeNode r1 = new TreeNode(4);
        TreeNode r1l = new TreeNode(3);
        TreeNode r1r = new TreeNode(6);
        root.left = l1;
        root.right = r1;
        r1.left = r1l;
        r1.right = r1r;

        System.out.println("------Validate BST------");
        System.out.println(obj.isBST(root));
    }

    private boolean isBST(TreeNode node) {
        if(node != null) {
            if (!isBST(node.left)) {
                return false;
            }
            if(prev != null && node.value <= prev.value) {
                return false;
            }
            prev = node;
            return isBST(node.right);
        }
        return true;
    }
}
