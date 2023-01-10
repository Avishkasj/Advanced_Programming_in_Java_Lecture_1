package com.ictec.dpatterns;

public class BillPughSingleton {
    //make the constructor private
    private BillPughSingleton() {
    }

    //create the inner class
    private static class Helper{
        //create the private static final object
        private static final BillPughSingleton bps = new BillPughSingleton();
    }

    //return the only object available
    public static BillPughSingleton getInstance() {
        return Helper.bps;
    }

    //Sample method to test
    public void showMessage(){
        System .out.println("Hello From Bill Pugh Singleton...!!!");
    }
}
