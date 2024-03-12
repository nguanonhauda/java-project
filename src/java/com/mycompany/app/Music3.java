package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise6_7_8;

public class Music3 {
    private static RIG gen = new RIG();

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[10];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = gen.next();
        }
        
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
            instrument.play();
            instrument.adjust();
            System.out.println();
        }
    }
}

