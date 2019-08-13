package com.overriding;

public class Clerk extends Employee {

    // This method overrides salary() of Parent
    int salary()
    {
        return base + 10000;
    }
}
