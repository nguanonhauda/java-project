package com.mycompany.app.Week2.ReusingClassess;

public class Ex16 {
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
        public void croak() {
            System.out.println("Frog is croaking");
        }
    }
}
