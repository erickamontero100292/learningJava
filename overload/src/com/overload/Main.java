package com.overload;

public class Main {
    public static void main(String[] args) {
        Translate translate = new Translate();
        translate.greet();
        translate.greet("John");
        translate.greet("John", "Nice too meet you");
    }
}
