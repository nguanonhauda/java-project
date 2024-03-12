package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise10;

class Animal {
    // First method
    public void methodOne() {
        System.out.println("Calling methodOne in Animal class");
        methodTwo(); // Call methodTwo
    }

    // Second method
    public void methodTwo() {
        System.out.println("Calling methodTwo in Animal class");
    }
}
