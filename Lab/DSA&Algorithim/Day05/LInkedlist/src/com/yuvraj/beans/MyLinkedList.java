package com.yuvraj.beans;

public class MyLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static Node head = null;

    public static void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Link the new node
        }
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(50);
        printList(); // Output: 10 20 30
    }
}
