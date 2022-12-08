package org.example;

public class LinkedList {
    // Inner class for the nodes of the linked list
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Fields for the linked list
    private Node head;
    private int size;

    // Constructor to create an empty linked list
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to add a new node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the linked list is empty, set the new node as the head
            head = newNode;
        } else {
            // Otherwise, traverse the list to find the last node and add the new node after it
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Increase the size of the list
        size++;
    }

    // Method to remove a node from the linked list
    public void remove(int data) {
        if (head == null) {
            // If the linked list is empty, do nothing
            return;
        } else if (head.data == data) {
            // If the node to be removed is the head, set the head to the next node
            head = head.next;
        } else {
            // Otherwise, traverse the list to find the node to be removed
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if (current.next != null) {
                // If the node was found, remove it by setting the next reference of the current node to the node after the one to be removed
                current.next = current.next.next;
            }
        }

        // Decrease the size of the list
        size--;
    }

    // Method to check whether a node with the given data exists in the list
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to get the size of the linked list
    public int size() {
        return size;
    }

    // Method to convert the linked list to a string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(list); // prints "5 10 15"

        list.remove(10);
        System.out.println(list); // prints "5 15"

        boolean exists = list.contains(15); // true
        int size = list.size(); // 2
        System.out.println(exists); // prints "true"
        System.out.println(size); // prints "2"
    }

}
