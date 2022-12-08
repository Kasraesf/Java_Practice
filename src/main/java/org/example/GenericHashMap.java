package org.example;

import java.util.HashMap;

public class GenericHashMap {
    // Declare a Generic HashMap with a String key and Integer value
    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    // Function to put a new key-value pair in the HashMap
    public void put(String key, Integer value) {
        map.put(key, value);
    }

    // Function to get the value associated with a given key
    public Integer get(String key) {
        return map.get(key);
    }

    // Function to remove a key-value pair from the HashMap
    public void remove(String key) {
        map.remove(key);
    }

    // Function to check if the HashMap contains a given key
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    // Function to check if the HashMap contains a given value
    public boolean containsValue(Integer value) {
        return map.containsValue(value);
    }

    // Function to return the size of the HashMap
    public int size() {
        return map.size();
    }

    // Function to clear the HashMap
    public void clear() {
        map.clear();
    }
    public static void main(String[] args) {
        // Create a new instance of the MyClass class
        GenericHashMap myClass = new GenericHashMap();

        // Put some key-value pairs in the HashMap
        myClass.put("key1", 1);
        myClass.put("key2", 2);
        myClass.put("key3", 3);

        // Get the value associated with "key2"
        int value = myClass.get("key2");
        System.out.println(value); // Outputs 2

        // Check if the HashMap contains "key1"
        boolean containsKey = myClass.containsKey("key1");
        System.out.println(containsKey); // Outputs true

        // Check if the HashMap contains the value 3
        boolean containsValue = myClass.containsValue(3);
        System.out.println(containsValue); // Outputs true

        // Remove the key-value pair with key "key3"
        myClass.remove("key3");

        // Clear the HashMap
        myClass.clear();

        // Check the size of the HashMap
        int size = myClass.size();
        System.out.println(size); // Outputs 0
    }
}
