package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise2_3_4;

public class Squares extends Shapes{
    @Override
    public void draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    @Override
    public void erase() {
        System.out.println("Erasing a Square");
    }

    @Override
    public void message() {
        System.out.println("This is a Square");
    }
}