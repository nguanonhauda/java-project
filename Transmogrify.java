package com.mycompany.app.Tuan3.Code1;

public class Transmogrify {
    abstract class Actor {
        abstract void act();
    }
          
    public class HappyActor extends Actor {
        public void act() { //…}
       }
    }   
       public class SadActor extends Actor {
        public void act() { //…}
       }
    }   
       public class Stage {
        Actor a = new HappyActor();
        void change() { a = new SadActor(); }
        void go() { a.act(); }
       }
}
