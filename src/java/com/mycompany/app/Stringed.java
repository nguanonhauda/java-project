package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise6_7_8;

class Stringed extends Instrument {
    public String toString() {
        return "Stringed";
    }

    void play() {
        System.out.println("Stringed is playing");
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
