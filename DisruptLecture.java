package com.mycompany.app.Tuan3.Code1;

public class DisruptLecture {
    
    public static class CellPhone {
        void cellPhone() {

        }

        public void ring(Tune t) {
            t.play();
        }
    }

    public static class Tune {

        public void play() {
            System.out.println("Tune.play()");
        }
    }

    public static class ObnoxiousTune extends Tune {
        public ObnoxiousTune(){

        }   
    }
}
