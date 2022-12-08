package org.example;

public class BinarySearchTree {
    private BinaryTreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // This method inserts a new value into the binary search tree.
    // It takes in a value and returns a reference to the root node of the tree.
    public BinaryTreeNode insert(int value) {
        // If the tree is empty, create a new node and set it as the root
        if (root == null) {
            root = new BinaryTreeNode(value);
            return root;
        }

        // Otherwise, insert the new value recursively
        insertRecursive(root, value);
        return root;
    }

    // This is a helper method for the insert() method. It takes in a node and a value,
    // and inserts the value into the correct position in the binary search tree.
    private void insertRecursive(BinaryTreeNode current, int value) {
        // If the new value is less than the current node's value, go left
        if (value < current.value) {
            // If the left child is null, insert the new node here
            if (current.left == null) {
                current.left = new BinaryTreeNode(value);
            }
            // Otherwise, recursively insert the value in the left subtree
            else {
                insertRecursive(current.left, value);
            }
        }
        // If the new value is greater than the current node's value, go right
        else {
            // If the right child is null, insert the new node here
            if (current.right == null) {
                current.right = new BinaryTreeNode(value);
            }
            // Otherwise, recursively insert the value in the right subtree
            else {
                insertRecursive(current.right, value);
            }
        }
    }
    // This method traverses the binary search tree and prints the value of each node
    public void traverse() {
        traverseRecursive(root);
    }

    // This is a helper method for the traverse() method. It takes in a node,
    // and traverses the subtree rooted at that node, printing the value of each node.
    private void traverseRecursive(BinaryTreeNode current) {
        // If the current node is null, there are no more nodes to traverse
        if (current == null) return;

        // First, traverse the left subtree
        traverseRecursive(current.left);

        // Then, print the value of the current node
        System.out.println(current.value);

        // Finally, traverse the right subtree
        traverseRecursive(current.right);
    }
    public static void main(String[] args) {
        // Create a new binary search tree
        BinarySearchTree tree = new BinarySearchTree();

        // Insert some values into the tree
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);

        // Traverse the tree and print the value of each node
        tree.traverse();

        // This should print the following values, in order:
        // 3, 5, 7, 10, 12, 15, 17
    }
}
