package com.mycompany.app.Week2.InitializationandCleanup;

public class Ex21 {
    public enum Type{
        DOLLAR , EURO , POUND , YEN , VND 
    }
    public void printCurrency(){
        Type[] type = Type.values();
        for ( int i=0 ; i<type.length ; i++) {
            System.out.println(type[i] + "Thứ tự " + i ) ;
        }
    }
}
