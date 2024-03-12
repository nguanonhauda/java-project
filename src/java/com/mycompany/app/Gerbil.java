package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise9_12_14;

class Gerbil extends Rodent {
    private Shared shared;
    Gerbil(Shared shared) {
        super(shared);
        System.out.println("Gerbil constructor");
        this.shared = shared;
        this.shared.addRef();
    }

    void eat() {
        System.out.println("Gerbil eating");
    }

    void sleep() {
        System.out.println("Gerbil sleeping");
    }

    void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
        super.dispose();
    }
}
