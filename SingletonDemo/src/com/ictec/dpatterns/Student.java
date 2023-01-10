package com.ictec.dpatterns;

public class Student {
    String name;
    static String gender= "Male";

    private Student(String name) {
        this.name = name;
        System.out.println("My name is :" + this.name);
    }
}
