package com.implementation.queue;

import com.implementation.linkedlist.Node;

public class MyQueue {
    Node first;
    Node last;
    int length;

    MyQueue() {
        first = last = null;
        length = 0;
    }

    public int peek() {
        if(first!=null) {
            return first.getData();
        }
        else {
            System.out.print("Empty Queue: ");
            return 0;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(first==null && last==null) {
            first = newNode;
            last = newNode;
            length++;
            return;
        }
        last.setNext(newNode);
        last = newNode;
        length++;
    }

    public Node dequeue() {
        if(first==null) {
            return null;
        }
        else if(first==last){
            Node unwantedNode = first;
            first = null;
            last = null;
            length--;
            return unwantedNode;
        }
        else {
            Node unwantedNode = first;
            first = first.getNext();
            length--;
            return unwantedNode;
        }
    }

    public void printQueue() {
        System.out.println(first);
        System.out.println("Length: " + length);
        System.out.println("Last: " + last);
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.peek();
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.printQueue();
        queue.enqueue(5);
        queue.printQueue();
        System.out.println(queue.peek());

        System.out.println(queue.dequeue());
        queue.printQueue();
        System.out.println(queue.dequeue());
        queue.printQueue();
    }
}
