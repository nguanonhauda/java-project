package com.mycompany.app.Week2.ReusingClassess;

public class Ex11 {
    class Cleanser {
        public void scrub() {
            System.out.println("Cleanser: scrubbing");
        }
    
        public void foam() {
            System.out.println("Cleanser: foaming");
        }
    }
    
    public class Detergent {
        private Cleanser cleanser = new Cleanser();
    
        // Các phương thức được giao
        public void scrub() {
            cleanser.scrub();
        }
    
        public void foam() {
            cleanser.foam();
        }
    
        // Các phương thức bổ sung
        public void sterilize() {
            System.out.println("Detergent: sterilizing");
        }
}
}
