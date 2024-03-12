package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise6_7_8;

class Percussion extends Instrument {
    public String toString() {
        return "Percussion";
    }

    void play() {
        System.out.println("Percussion is playing");
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
