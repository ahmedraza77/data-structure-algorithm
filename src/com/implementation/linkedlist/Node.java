package com.implementation.linkedlist;

public class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
