package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise9_12_14;

public class RodentTest {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Rodent[] rodents = {
                new Mouse(shared),
                new Gerbil(shared),
                new Hamster(shared)
        };

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.sleep();
            rodent.dispose();
        }
    }
}