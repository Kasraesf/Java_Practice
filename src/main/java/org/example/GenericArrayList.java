package org.example;

import java.util.ArrayList;

public class GenericArrayList<T> {

    private ArrayList<T> list;

    public GenericArrayList() {
        // Create a new ArrayList object and initialize the list field with it
        this.list = new ArrayList<T>();
    }

    public int size() {
        // Return the size of the list
        return this.list.size();
    }

    public T get(int index) {
        // Return the element at the specified index in the list
        return this.list.get(index);
    }

    public void add(T element) {
        // Add the specified element to the end of the list
        this.list.add(element);
    }

    public void add(int index, T element) {
        // Insert the specified element at the specified index in the list
        this.list.add(index, element);
    }

    public void clear() {
        // Remove all elements from the list
        this.list.clear();
    }

    public boolean contains(T element) {
        // Return true if the list contains the specified element, false otherwise
        return this.list.contains(element);
    }

    public T remove(int index) {
        // Remove the element at the specified index in the list and return it
        return this.list.remove(index);
    }

    public boolean remove(T element) {
        // Remove the first occurrence of the specified element from the list, if it exists
        return this.list.remove(element);
    }

    public static void main(String[] args) {
        // Create a new MyArrayList object that can store String objects
        GenericArrayList<String> myList = new GenericArrayList<String>();

        // Add some elements to the list
        myList.add("hello");
        myList.add("world");
        myList.add("how");
        myList.add("are");
        myList.add("you");

        // Print the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Print the elements of the list
        System.out.println("Elements in the list: " + myList.toString());
    }

}
