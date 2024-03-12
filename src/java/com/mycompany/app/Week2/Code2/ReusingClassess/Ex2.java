package com.mycompany.app.Week2.Code2.ReusingClassess;

public class Ex2 {
    // lớp cha deterget
    class Deterget{
        public void scrub(){
            System.out.println("Scrubing....");
        }
        public void foam(){
            System.out.println("Foaming....");
        }
    }
    // lớp con kế thừa deterget
    class NewDeterget extends Deterget{
        public void scrub(){
            System.out.println("New Scrubing...");
        }
        // Phương thức mới
        public void sterilize(){
            System.out.println("Sterilize....");
        }
    }

}
