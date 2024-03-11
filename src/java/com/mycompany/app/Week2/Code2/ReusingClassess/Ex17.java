package com.mycompany.app.Week2.ReusingClassess;

public class Ex17 {
    class Amphibian {
        public void swim() {
            System.out.println("Amphibian is swimming");
        }
    
        public void jump() {
            System.out.println("Amphibian is jumping");
        }
    }
    
    // Lớp Frog kế thừa từ Amphibian
    class Frog extends Amphibian {
        public void swim() {
            System.out.println("Frog is swimming");
        }
        
        public void jump() {
            System.out.println("Frog is jumping");
        }
        public void croak() {
            System.out.println("Frog is croaking");
        }
    }
}
