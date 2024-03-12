package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise9_12_14;

class Mouse extends Rodent {
    private Shared shared;
    Mouse(Shared shared) {
        super(shared);
        System.out.println("Mouse constructor");
        this.shared = shared;
        this.shared.addRef();
    }

    void eat() {
        System.out.println("Mouse eating");
    }

    void sleep() {
        System.out.println("Mouse sleeping");
    }

    void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
        super.dispose();
    }
}
