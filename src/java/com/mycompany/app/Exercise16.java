package com.mycompany.app.Tuan2.PolimorphismWeek2;

public class Exercise16 {
    class Actor { 
        public void act() {

        } 
    } 
       class HappyActor extends Actor { 
        public void act() { 
            System.out.println("HappyActor"); 
        } 
    } 
       class SadActor extends Actor { 
        public void act() { 
            System.out.println("SadActor"); 
        } 
    } 
       class Stage { 
        private Actor actor = new HappyActor(); 
        public void change() { 
            actor = new SadActor(); 
        } 
        public void performPlay() { 
            actor.act(); 
        } 
    } 

    class AlertStatus {
        public void alert() {
            System.out.println("AlertStatus: Unknown alert");
        }
    }
    
    class GreenAlertStatus extends AlertStatus {
        @Override
        public void alert() {
            System.out.println("AlertStatus: Green alert");
        }
    }
    
    class YellowAlertStatus extends AlertStatus {
        @Override
        public void alert() {
            System.out.println("AlertStatus: Yellow alert");
        }
    }
    
    class RedAlertStatus extends AlertStatus {
        @Override
        public void alert() {
            System.out.println("AlertStatus: Red alert");
        }
    }
    
    class Starship {
        private AlertStatus alertStatus = new GreenAlertStatus();
    
        public void changeToGreen() {
            alertStatus = new GreenAlertStatus();
        }
    
        public void changeToYellow() {
            alertStatus = new YellowAlertStatus();
        }
    
        public void changeToRed() {
            alertStatus = new RedAlertStatus();
        }
    
        public void performAlert() {
            alertStatus.alert();
        }
    }
    
    public class Transmogrify {
        public void main(String[] args) {
            Starship starship = new Starship();
            starship.performAlert();
            starship.changeToYellow();
            starship.performAlert();
            starship.changeToRed();
            starship.performAlert();
        }
    }
}