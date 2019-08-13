package com.overriding;

public class Main {

    public static void main(String[] args) {
        Employee manager = new Manager();

        System.out.print("Manager's salary : ");
        printSalary(manager);

        Employee clerk = new Clerk();
        System.out.print("Clerk's salary : ");
        printSalary(clerk);
    }

    static void printSalary(Employee e) {
        System.out.println(e.salary());
    }
}
