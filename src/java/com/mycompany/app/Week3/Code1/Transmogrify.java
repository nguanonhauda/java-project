package com.mycompany.app.Week3.Code1;

public class Transmogrify {
    abstract class Actor {
        abstract void act();
       }
       class HappyActor extends Actor {
        public void act() { //…}
       }
       class SadActor extends Actor {
        public void act() { //…}
       }
       class Stage {
        Actor a = new HappyActor();
        void change() { a = new SadActor(); }
        void go() { a.act(); }
       }
}
       }
    }
