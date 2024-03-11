package com.mycompany.app.Week3.Code2;

//import com.mycompany.app.Week3.Code2.Exercise17Polymorphism.Cycle;

public class App {
    Exercise17Polymorphism ex17 = new Exercise17Polymorphism();
    Exercise17Polymorphism.Cycle[] cycles = new Exercise17Polymorphism.Cycle[3] ;
    cycles[0] = ex17.new Uncycle();
    cycles[1] = ex17.new Bycycle();
    cycles[2] = ex17.new Tricucle();

    for (Exercise17Polymorphism.Cycle cycle : cycles) {
        if (cycle instanceof Exercise17Polymorphism.Uncycle) {
            ((Exercise17Polymorphism.Uncycle) cycle).balance();
        } else if (cycle instanceof Exercise17Polymorphism.Bycycle) {
            ((Exercise17Polymorphism.Bycycle) cycle).balance();
        }
    }
}

