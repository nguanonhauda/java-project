package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise6_7_8;

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }

    void play() {
        System.out.println("Woodwind is playing");
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}
