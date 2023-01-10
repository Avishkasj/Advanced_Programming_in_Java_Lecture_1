package com.ictec.dpatterns;

//4.Use the Factory to get object of concrete classes
// by passing information
public class FactoryDemo {
    public static void main(String[] args) {
        //Create a specific object through factory and test it
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.getShape("Circle");
        circle.draw();
    }
}
