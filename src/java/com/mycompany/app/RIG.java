package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise6_7_8;

import java.util.Random;

class RIG {
    private Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(5)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
        }
    }
}
