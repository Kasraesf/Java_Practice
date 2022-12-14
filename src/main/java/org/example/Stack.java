package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
public class Stack {
    // The list of elements in the stack
    private List<Object> elements;

    // Constructs a new empty stack
    public Stack() {
        this.elements = new ArrayList<Object>();
    }

    // Pushes an element onto the top of the stack
    public void push(Object element) {
        this.elements.add(element);
    }

    // Removes and returns the top element from the stack
    // Throws an EmptyStackException if the stack is empty
    public Object pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.elements.remove(this.elements.size() - 1);
    }

    // Returns the top element from the stack without removing it
    // Throws an EmptyStackException if the stack is empty
    public Object peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.elements.get(this.elements.size() - 1);
    }

    // Returns true if the stack is empty, and false otherwise
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    // Returns an iterator for the elements in the stack
    public Iterator<Object> iterator() {
        return this.elements.iterator();
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push("two");
        stack.push(3.0);

        do {
            Object element = stack.pop();
            if (element instanceof Integer) {
                System.out.println((Integer) element);
            } else if (element instanceof String) {
                System.out.println((String) element);
            } else if (element instanceof Double) {
                System.out.println((Double) element);
            }
        }while (!stack.isEmpty());
    }

}
