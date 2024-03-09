package com.mycompany.app.Week2.InitializationandCleanup;

public class Ex8 {
    public void method1(){
        // gọi method2 ko có this
        method2();
        this.method2();
    }
    public void method2(){
        System.out.println("Bên trong method 2 "); 
    }
}
