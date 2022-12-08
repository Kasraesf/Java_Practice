package org.example;

public class DoublyLinkedList{
    DoublyNode head; // head of the doubly linked list

    // Constructor to create an empty doubly linked list
    DoublyLinkedList() {
        head = null;
    }

    // Function to insert a new node at the front of the list
    public void insertAtFront(int data) {
        // Create a new node
        DoublyNode newNode = new DoublyNode(data);

        // If the doubly linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        }
        else {
            // Set the next of the new node to the current head
            newNode.next = head;

            // Set the previous of the current head to the new node
            head.prev = newNode;

            // Set the new node as the new head
            head = newNode;
        }
    }

    // Function to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        // Create a new node
        DoublyNode newNode = new DoublyNode(data);

        // If the doubly linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        }
        else {
            // Find the last node in the list
            DoublyNode last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Set the next of the last node to the new node
            last.next = newNode;

            // Set the previous of the new node to the last node
            newNode.prev = last;
        }
    }

    // Function to insert a new node after a given node
    public void insertAfter(DoublyNode afterNode, int data) {
        // Create a new node
        DoublyNode newNode = new DoublyNode(data);

        // If the doubly linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        }
        else {
            // Set the next of the new node to the next of the afterNode
            newNode.next = afterNode.next;

            // Set the previous of the new node to the afterNode
            newNode.prev = afterNode;

            // Set the previous of the next node to the new node
            if (afterNode.next != null) {
                afterNode.next.prev = newNode;
            }

            // Set the next of the afterNode to the new node
            afterNode.next = newNode;
        }
    }
    // Function to delete a node from the doubly linked list
    public void delete(DoublyNode node) {
        // If the doubly linked list is empty, return
        if (head == null) {
            return;
        }
        else {
            // If the node to be deleted is the head, set the next node as the new head
            if (node == head) {
                head = node.next;
            }

            // Set the previous of the next node to the previous of the current node
            if (node.next != null) {
                node.next.prev = node.prev;
            }

            // Set the next of the previous node to the next of the current node
            if (node.prev != null) {
                node.prev.next = node.next;
            }
        }
    }
    // Function to print the doubly linked list
    public void printList() {
        // If the doubly linked list is empty, return
        if (head == null) {
            return;
        }
        else {
            // Print the data of each node in the list
            DoublyNode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert nodes at the front of the list
        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtFront(3);
        list.insertAtFront(4);

        // Insert nodes at the end of the list
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);

        // Insert nodes after a given node
        list.insertAfter(list.head.next.next, 9);
        list.insertAfter(list.head.next.next.next, 10);
        list.insertAfter(list.head.next.next.next.next, 11);
        list.insertAfter(list.head.next.next.next.next.next, 12);

        // Delete nodes from the list
        list.delete(list.head.next.next.next);
        list.delete(list.head.next.next.next.next.next);

        // Print the list
        list.printList();
    }
}