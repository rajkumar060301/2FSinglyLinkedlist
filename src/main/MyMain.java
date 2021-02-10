package main;

import implementation.MyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MyLinkedList LinkedList = new MyLinkedList();
        LinkedList.addFirst(500);
        LinkedList.traverse();
        LinkedList.addFirst(700);
        LinkedList.addFirst(200);
        LinkedList.traverse();
        System.out.println("size = " + LinkedList.size());
    }
}
