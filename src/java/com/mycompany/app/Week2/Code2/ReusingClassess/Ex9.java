package com.mycompany.app.Week2.ReusingClassess;

public class Ex9 {
    class Component1 {
        public Component1() {
            System.out.println("Component1 được gọi.");
        }
    }
    
    // Lớp Component2
    class Component2 {
        public Component2() {
            System.out.println("omponent2 được gọi.");
        }
    }
    
    // Lớp Component3
    class Component3 {
        public Component3() {
            System.out.println("Component3 được gọi.");
        }
    }
    
    // Lớp Root
    class Root {
        private Component1 component1;
        private Component2 component2;
        private Component3 component3;
    
        public Root() {
            component1 = new Component1();
            component2 = new Component2();
            component3 = new Component3();
            System.out.println("Root được gọi.");
        }
    }
    
    // Lớp Stem kế thừa từ Root
    class Stem extends Root {
        private Component1 component1;
        private Component2 component2;
        private Component3 component3;
    
        public Stem() {
            component1 = new Component1();
            component2 = new Component2();
            component3 = new Component3();
            System.out.println("Stem được gọi.");
        }
    }
}