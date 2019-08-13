package com.overload;

public class Translate {
// Java allows us to declare the same method but with different type or number of arguments in a class
    void greet() {
        System.out.println("Hello");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }

    void greet(String name, String message) {
        System.out.println("Hello " + name + " this message is for you: "+ message);
    }

}
