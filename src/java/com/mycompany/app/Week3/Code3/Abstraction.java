package com.mycompany.app.Week3.Code3;

public class Abstraction {
    abstract class Animal {
        public abstract void animalSound();
        public void sleep() {
          System.out.println("Zzz");
        }
      }
      
      class Pig extends Animal {
        public void animalSound() {
          System.out.println("The pig says: wee wee");
        }
      }
}
