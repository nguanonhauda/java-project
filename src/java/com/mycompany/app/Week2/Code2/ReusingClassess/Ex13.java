package com.mycompany.app.Week2.ReusingClassess;

public class Ex13 {
    class Base {
        
        public void overloadedMethod(int x) {
            System.out.println("Overloaded method with int parameter: " + x);
        }
    
        public void overloadedMethod(double x) {
            System.out.println("Overloaded method with double parameter: " + x);
        }
    
        public void overloadedMethod(String x) {
            System.out.println("Overloaded method with String parameter: " + x);
        }
    }
    
    // Lớp dẫn xuất (derived class)
    class Derived extends Base {
        // Thêm một phương thức mới nạp chồng
        public void overloadedMethod(boolean x) {
            System.out.println("New overloaded method with boolean parameter: " + x);
        }
    }
    
}
