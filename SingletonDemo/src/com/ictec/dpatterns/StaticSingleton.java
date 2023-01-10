package com.ictec.dpatterns;

public class StaticSingleton {
    //creating a private static instance
    private static StaticSingleton ss;
    //Make contructor private
    private StaticSingleton() {
    }

    //Static block initialization for exception handling
    static{
        try {
            ss = new StaticSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured while creating the object");
        }
    }

    //Return the only object available
    public static StaticSingleton getInstance() {
        return ss;
    }

    //Sample method to test
    public void showMessage(){
        System .out.println("Hello From Static Singleton...!!!");
    }
}
