package com.mycompany.app.Week2.ReusingClassess;

public class Ex10 {
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
    
    class Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;
    public Root (Component1 c1 , Component2 c2 , Component3 c3){
        this.component1 = c1 ; 
        this.component2 = c2 ; 
        this.component3 = c3 ; 
        System.out.println("Root được gọi");
    }
    }
    class Stem extends Root {
        private Component1 component1;
        private Component2 component2;
        private Component3 component3;
        public Stem (Component1 c1 , Component2 c2 , Component3 c3){
            super(c1,c2,c3) ; 
            System.out.println("Stem được gọi");
        }
    }
}
