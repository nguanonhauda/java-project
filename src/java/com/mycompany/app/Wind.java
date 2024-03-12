package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise6_7_8;

class Wind extends Instrument {
    public String toString() {
        return "Wind";
    }

    void play() {
        System.out.println("Wind is playing");
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
