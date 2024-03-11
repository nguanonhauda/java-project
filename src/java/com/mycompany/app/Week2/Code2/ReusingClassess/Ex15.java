package com.mycompany.app.Week2.ReusingClassess;

public class Ex15 {
    class MyClass {
        protected void protectedMethod() {
            System.out.println("This is a protected method");
        }
    }
    class DerivedClass extends MyClass {
        public void callProtectedMethod() {
            protectedMethod();
        }
    }
}
