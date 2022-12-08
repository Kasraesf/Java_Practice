package org.example;

import java.util.ArrayList;

public class GenericBinaryTree <T extends Comparable<T>>{
    private Node<T> root;

    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insertRecursive(root, data);
        }
    }

    private void insertRecursive(Node<T> current, T data) {
        if (data.compareTo(current.data) < 0) {
            if (current.left == null) {
                current.left = new Node<>(data);
            } else {
                insertRecursive(current.left, data);
            }
        } else if (data.compareTo(current.data) > 0) {
            if (current.right == null) {
                current.right = new Node<>(data);
            } else {
                insertRecursive(current.right, data);
            }
        }
    }

    public boolean search(T data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node<T> current, T data) {
        if (current == null) {
            return false;
        }
        if (data.compareTo(current.data) == 0) {
            return true;
        }
        return data.compareTo(current.data) < 0 ? searchRecursive(current.left, data) : searchRecursive(current.right, data);
    }

    public void delete(T data) {
        root = deleteRecursive(root, data);
    }

    private Node<T> deleteRecursive(Node<T> current, T data) {
        if (current == null) {
            return null;
        }
        if (data.compareTo(current.data) == 0) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }
            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            // Case 3: 2 children
            T smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (data.compareTo(current.data) < 0) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }
        current.right = deleteRecursive(current.right, data);
        return current;
    }

    private T findSmallestValue(Node<T> root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    private static class Node<T extends Comparable<T>> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        private Node(T data) {
            this.data = data;
        }
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node<T> current) {
        if (current != null) {
            printInOrderRecursive(current.left);
            System.out.print(current.data + " ");
            printInOrderRecursive(current.right);
        }
    }

    public static void main(String[] args) {
        GenericBinaryTree<Integer> bst = new GenericBinaryTree<>();

        // Insert some values into the tree
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(13);
        bst.insert(17);

        // Print all of the nodes in the tree
        bst.printInOrder();
    }


}
