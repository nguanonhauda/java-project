package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise10;

class Cat extends Animal {
    @Override
    public void methodTwo() {
        System.out.println("Calling methodTwo in Cat class");
    }


// In the main method
    public static void main(String[] args) {
    Cat cat = new Cat();
    Animal animal = cat; // Upcast
    animal.methodOne(); // Call methodOne
    }
}