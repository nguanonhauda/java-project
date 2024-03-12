package com.mycompany.app.Tuan2.PolimorphismWeek2.Exercise1_5_17;

public class Cycle{
    void ride(){
        System.out.println("Riding a cycle");
    }
    public int wheels(){ //For exercise 5
        return 0;
    }

    public void chess(){
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
