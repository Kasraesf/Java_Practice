package org.example;

public class Stack {
    private int[] stack;
    private int top;
    private int size;
    public Stack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = value;
        return value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = stack[top];
        stack[top--] = 0;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
