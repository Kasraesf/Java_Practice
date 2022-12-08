package org.example;

import java.util.ArrayList;

public class GenericBinaryTree <T extends Comparable<T>>{
    private Node<T> root;
    public GenericBinaryTree() {
        root = null;
    }

    // adds a new node with the given data to the tree
    public void add(T data) {
        root = add(root, data);
    }

    // recursive method for adding a new node with the given data to the tree
    private Node<T> add(Node<T> current, T data) {
        if (current == null) {
            return new Node<T>(data);
        }

        if (data.compareTo(current.getData()) < 0) {
            current.setLeft(add(current.getLeft(), data));
        } else if (data.compareTo(current.getData()) > 0) {
            current.setRight(add(current.getRight(), data));
        }

        return current;
    }

    // checks if the tree contains the given data
    public boolean contains(T data) {
        return contains(root, data);
    }

    // recursive method for checking if the tree contains the given data
    private boolean contains(Node<T> current, T data) {
        if (current == null) {
            return false;
        }

        if (data.compareTo(current.getData()) == 0) {
            return true;
        } else if (data.compareTo(current.getData()) < 0) {
            return contains(current.getLeft(), data);
        } else {
            return contains(current.getRight(), data);
        }
    }

    // returns a list of the tree's elements in ascending order
    public ArrayList<T> inOrder() {
        ArrayList<T> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    // recursive method for adding the tree's elements to the list in ascending order
    private void inOrder(Node<T> current, ArrayList<T> list) {
        if (current == null) {
            return;
        }

        inOrder(current.getLeft(), list);
        list.add(current.getData());
        inOrder(current.getRight(), list);
    }

    // inner class for creating nodes in the tree
    private class Node<T extends Comparable<T>> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }
}
