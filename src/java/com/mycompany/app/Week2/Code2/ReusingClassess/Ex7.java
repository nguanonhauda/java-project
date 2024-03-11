package com.mycompany.app.Week2.ReusingClassess;

public class Ex7 {
    class A{
        private int aValue;
        public A( int value){
            this.aValue = value ;
            System.out.println("Class A " + aValue);
        }
    }
    class B {
        private int bValue;
        public B(int value){
            this.bValue=value;
            System.out.println("Class B " + bValue);
        }
    }
    class C extends A {
        private B bObj; 
        private int cValue;
        
        public C(int aValue , int bValue, int cValue){
            super(aValue);
            this.bObj = new B(bValue);
            this.cValue= cValue;
            System.out.println("Class C " + cValue) ; 
            
        }
    }

}
