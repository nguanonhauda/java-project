package com.mycompany.app.Week2.ReusingClassess;

public class Ex5 {
    class A{
        public A(){
        System.out.println("Gọi class A ");
    }}
    class B {
        public B(){
            System.out.println("Gọi class B ");
        }
    }
    class C extends A {
        private B bObject;

        public C (){
            bObject = new B() ; 
            System.out.println("Gọi class C" );
        }
    }
}
