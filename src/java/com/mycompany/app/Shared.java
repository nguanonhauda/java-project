package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise9_12_14;

class Shared {
    private static long counter = 0;
    private final long id = counter++;

    Shared() {
        System.out.println("Creating " + this);
    }

    void addRef() {
        System.out.println("Adding reference to " + this);
    }

    protected void dispose() {
        if (--counter == 0) {
            System.out.println("Disposing " + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}
