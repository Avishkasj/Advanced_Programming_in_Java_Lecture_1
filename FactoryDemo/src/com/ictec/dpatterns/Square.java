package com.ictec.dpatterns;

//2. Create concrete classes implementing the interface
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Square...");
    }
}
