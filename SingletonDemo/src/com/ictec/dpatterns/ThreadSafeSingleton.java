package com.ictec.dpatterns;

public class ThreadSafeSingleton {
    //creating a private static instance
    private static ThreadSafeSingleton tss;
    //Make contructor private
    private ThreadSafeSingleton() {
    }

    //Return the only object available
    public static synchronized ThreadSafeSingleton getInstance() {
        //check for the existance of the object
        //if not create a new one otherwise return the existing one
        if (tss == null){
            tss = new ThreadSafeSingleton();
        }
        return tss;
    }

    //Sample method to test
    public void showMessage(){
        System .out.println("Hello From Thread Safe Singleton...!!!");
    }
}
