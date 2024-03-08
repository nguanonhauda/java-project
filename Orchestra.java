package com.mycompany.app.Tuan3.Code2;

public abstract class Orchestra {
    public abstract class Instrument {
        abstract void play();    
    
    
    String what () {
        return "";
    }

    abstract void adjust();
    }

    class Wind extends Instrument {
        void play() {
            System.out.println("Wind.play()");
        } 
        
        String what() {
            return "Wind";
        }
        
        void adjust() {
           System.out.println("Wind.adjust()");
        }
    }

    class Percussion extends Instrument {
        void play() {
            System.out.println("Percussion.play()");
        } 
        
        String what() {
            return "Percussion";
        }
        
        void adjust() {
           System.out.println("Percussion.adjust()");
        }
    }

    class Stringed extends Instrument {
        void play() {
            System.out.println("Stringed.play()");
        } 
        
        String what() {
            return "Stringed";
        }
        
        void adjust() {
           System.out.println("Stringed.adjust()");
        }
    }

    class Woodwind extends Wind {
        void play() {
            System.out.println("Woodwind.play()");
        } 
        
        String what() {
            return "Woodwind";
        }
        
    }

    class Brass extends Wind {
        void play() {
            System.out.println("Brass.play()");
        } 
        
        void adjust() {
           System.out.println("Brass.adjust()");
        }
    }




    

       
        

    
}
