package com.mycompany.app.Week3.Code3;

import com.mycompany.app.Week3.Code3.Polymorphism.Animal;
import com.mycompany.app.Week3.Code3.Polymorphism.Dog;
import com.mycompany.app.Week3.Code3.Polymorphism.Pig;

public class App {
    public static void main(String[] args) {
    // Polymorphism
    /*Polymorphism h = new Polymorphism() ; 
    Polymorphism.Animal myAnimal = h.new Animal();  // Create a Animal object
    Polymorphism.Animal myPig = h.new Pig();  // Create a Pig object
    Polymorphism.Animal myDog = h.new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();*/


    // Abstraction
    Abstraction b = new Abstraction(); 
    Abstraction.Pig myPig = b.new Pig(); 
    myPig.animalSound();
    myPig.sleep();
  }
}
