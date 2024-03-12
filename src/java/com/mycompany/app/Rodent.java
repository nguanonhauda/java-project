package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise9_12_14;

class Rodent {
    private Shared shared;
    Rodent(Shared shared) {
        System.out.println("Rodent constructor");
        this.shared = shared;
        this.shared.addRef();
    }

    void eat() {
        System.out.println("Rodent eating");
    }

    void sleep() {
        System.out.println("Rodent sleeping");
    }

    void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }
}


