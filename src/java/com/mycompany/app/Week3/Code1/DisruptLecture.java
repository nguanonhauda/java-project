package com.mycompany.app.Week3.Code1;

public class DisruptLecture {
    class CellPhone{
        CellPhone(){
        }
        public void ring (Tune t ){t.play();}
    }
    class Tune {
        public void play(){
            System.out.println("Tune.play");
        }
    }
    class ObnoxiusTune extends Tune {
        public ObnoxiusTune(){}
        public void play(){
            System.out.println("ObnoxiusTune.play()");
        }
    }
}
