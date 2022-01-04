package com.implementation.stack;

import com.implementation.linkedlist.Node;

public class MyStack {
    Node top;
    int length;

    MyStack() {
        length = 0;
    }

    public int peek() {
        if(top!=null){
            return top.getData();
        }
        return 0;
    }

    public void pop() {
        if(top==null) {
            return;
        }
        else{
            top = top.getNext();
            length--;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        if(length==0) {
            top = node;
            length++;
            return;
        }
        Node holdingNode = top;
        top = node;
        node.setNext(holdingNode);
        length++;
    }

    public void printStack() {
        System.out.println(top);
        System.out.println(length);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.peek());
        stack.push(10);
        stack.push(15);
        stack.push(5);
        stack.pop();
        stack.push(2);
        stack.pop();

        stack.printStack();
    }
}
