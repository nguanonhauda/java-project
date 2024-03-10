package com.mycompany.app.Week2.ReusingClassess;

public class Ex12 {
    class Component1 {
        public Component1() {
            System.out.println("Component1 được gọi.");
        }

        public void dispose() {
            System.out.println("Dispose của Component1 được gọi.");
        }
    }
    
    class Component2 {
        public Component2() {
            System.out.println("Component2 được gọi.");
        }

        public void dispose() {
            System.out.println("Dispose của Component2 được gọi.");
        }
    }
    
    class Component3 {
        public Component3() {
            System.out.println("Component3 được gọi.");
        }

        public void dispose() {
            System.out.println("Dispose của Component3 được gọi.");
        }
    }
    
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

        public void dispose() {
            component1.dispose();
            component2.dispose();
            component3.dispose();
            System.out.println("Dispose của Root được gọi.");
        }
    }
    
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

        public void dispose() {
            super.dispose();
            System.out.println("Dispose của Stem được gọi.");
        }
    }
}