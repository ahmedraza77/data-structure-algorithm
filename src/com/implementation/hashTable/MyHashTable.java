package com.implementation.hashTable;

public class MyHashTable {
    int[] data;
    int size;

    MyHashTable(int capacity) {
        data = new int[capacity];
    }

    private int myHashing (String key) {
        int hash = 0;
        for (int i=0; i<key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    //O(1) - Until Collision
    public boolean set(String key, int value) {
        int index = myHashing(key);
        if(data[index]!=0) {
            data[index] = value;
            size++;
            return true;
        }
        else{
            data[index] = value;
            return false;
        }
    }

    //O(1) - Until Collision
    public int get(String key) {
        int index = myHashing(key);
        if(data[index]!=0) {
            return  data[index];
        }
        else{
            System.out.print("No element: ");
            return 0;
        }
    }

    //O(1)
    public void remove(String key) {
        int index = myHashing(key);
        if(data[index]!=0){
            data[index] = 0;
            size--;
        }

    }

    public static void main(String[] args) {
        MyHashTable ht = new MyHashTable(20);

        System.out.println(ht.set("Maths", 75));
        System.out.println(ht.set("Physics", 86));
        System.out.println(ht.set("Chemistry", 81));
        System.out.println(ht.set("Chemistry", 91));

        System.out.println(ht.get("Bio"));
        System.out.println(ht.get("Maths"));
        System.out.println(ht.get("Physics"));
        System.out.println(ht.get("Chemistry"));
        ht.remove("Maths");
        System.out.println(ht.get("Maths"));
    }
}
