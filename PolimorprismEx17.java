package com.mycompany.app.Tuan3.Code2;

class Cycle{
    void ride(){
        System.out.println("Riding a cycle");
    }

    
}
class Unicycle extends Cycle{

    void ride(){
        System.out.println("Riding a unicycle");
    }
    public void balance() {
        System.out.println("Balancing Unicycle");
    }
}
class Bicycle extends Cycle{

    void ride(){
        System.out.println("Riding a bicycle");
    }
    public void balance() {
        System.out.println("Balancing Bicycle");
    }
}
class Tricycle extends Cycle{

    void ride(){
        System.out.println("Riding a tricycle");
    }
    
}
public class PolimorprismEx17 {
    public void bike(){
        Cycle cycle1 = new Unicycle();
        Cycle cycle2 = new Bicycle();
        Cycle cycle3 = new Tricycle();

        ride(cycle1);
        ride(cycle2);
        ride(cycle3);
    }
    static void ride(Cycle cycle){
        cycle.ride();
    }
}
