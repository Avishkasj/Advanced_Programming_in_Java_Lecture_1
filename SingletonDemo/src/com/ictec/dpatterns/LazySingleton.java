package com.ictec.dpatterns;

public class LazySingleton {
    //creating a private static instance
    private static LazySingleton ls;
    //Make constructor private
    private LazySingleton() {
    }

    //Return the only object available
    public static LazySingleton getInstance() {
        //Check for the existance of the object
        //If not create a new one otherwise return the existing one
        if (ls == null){
            ls = new LazySingleton();
        }
        return ls;
    }

    //Sample method to test
    public void showMessage(){
        System .out.println("Hello From Lazy Singleton...!!!");
    }
}
