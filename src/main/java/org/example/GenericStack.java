package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
public class GenericStack<T> implements Iterable<T>{
    private List<T> elements;

    // Constructs a new empty stack
    public GenericStack() {
        this.elements = new ArrayList<T>();
    }

    // Pushes an element onto the top of the stack
    public void push(T element) {
        this.elements.add(element);
    }

    // Removes and returns the top element from the stack
    // Throws an EmptyStackException if the stack is empty
    public T pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.elements.remove(this.elements.size() - 1);
    }

    // Returns the top element from the stack without removing it
    // Throws an EmptyStackException if the stack is empty
    public T peek() {
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
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }

    public static void main(String[] args){
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (Integer element : stack){
            System.out.print(element + " ");
        }
    }

}
