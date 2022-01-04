package com.implementation.linkedlist;

public class SinglyLinkedList {
    Node head;
    int length;

    SinglyLinkedList(int value) {
        this.head = new Node(value);
        length++;
    }

    //O(1)
    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    //O(1)
    public void append (int value) {
        Node newNode = new Node(value);
        if(head.next==null){
            head.next = newNode;
            length++;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        length++;
    }

    //O(n)
    public void insert(int index, int value) {
        if(index>=length){
            append(value);
            return;
        }
        Node newNode = new Node(value);
        Node leftNode = traverseToNode(index-1);
        newNode.next = leftNode.next;
        leftNode.next = newNode;
        length++;
    }

    //O(n)
    public void remove(int index) {
        Node leftNode = traverseToNode(index-1);
        Node unwantedNode = leftNode.next;
        leftNode.next = unwantedNode.next;
        length--;
    }

    //O(n)
    public Node traverseToNode(int index) {
        Node currentNode = head;
        for (int i=0; i<index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public Node reverseList() {
        if(length==1) {
            return head;
        }
        Node first = head;
        Node second = first.next;
        while (second!=null) {
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head.next = null;
        head = first;
        return head;
    }

    public void printList() {
        int[] arr = new int[length];
        Node currentNode = head;
        for (int i=0; i<length; i++) {
            arr[i] = currentNode.data;
            currentNode = currentNode.next;
        }
        for (int i : arr) {
            System.out.print(i + " -> ");
        }
        System.out.println();
        //System.out.println(head);
    }


    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList(10);
        myLinkedList.append(14);
        myLinkedList.prepend(6);
        myLinkedList.prepend(8);
        myLinkedList.insert(2, 9);
        myLinkedList.remove(3);
        myLinkedList.printList();
        myLinkedList.reverseList();
        myLinkedList.printList();
    }
}
