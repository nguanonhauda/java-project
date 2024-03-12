package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise9_12_14;

class Hamster extends Rodent {
    private Shared shared;
    Hamster(Shared shared) {
        super(shared);
        System.out.println("Hamster constructor");
        this.shared = shared;
        this.shared.addRef();
    }

    void eat() {
        System.out.println("Hamster eating");
    }

    void sleep() {
        System.out.println("Hamster sleeping");
    }

    void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
        super.dispose();
    }
}
