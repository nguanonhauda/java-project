package test.java.com.mycompany.app;

public class big {
    public abstract class Intrusment {
        abstract void play();
        String what (){
            return " " ; 
        }
        abstract void adjust () ;
        
    }
    
    class Wind extends Intrusment {
        void play (){
            System.out.println("Wind.play");
        }
        String what (){
            return " Wind " ; 
        }
        void adjust(){
            System.out.println("Wind.adjust");
        }
    }

    class Percussion extends Intrusment {
        void play (){
            System.out.println("Percussion.play");
        }
        String what(){
            return "Percussion";
        }
        void adjust(){
            System.out.println("Percussion") ;
        }
    }
    class Stringed extends Intrusment{
        void play (){
            System.out.println("Stringed.play");
        }
        String what (){
            return "Stringed"  ; 
        }
        void adjust (){
            System.out.println("Stringed.adjust");
        }
    }
    class Woodwind extends Wind {
        void play (){
            System.out.println("Woodwind");
        }
        String what (){
            return "Woodwind" ; 
        }
    }
    class Brass extends Wind {
        void play (){
            System.out.println("Brass");
        }
        String what (){
            return "Brass" ; 
        }
    }
}  
       

    
