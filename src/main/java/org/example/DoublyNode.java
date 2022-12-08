package org.example;

class DoublyNode {
    int data; // data stored in the node
    DoublyNode next; // reference to the next node in the list
    DoublyNode prev; // reference to the previous node in the list

    // Constructor to create a new node with given data
    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
