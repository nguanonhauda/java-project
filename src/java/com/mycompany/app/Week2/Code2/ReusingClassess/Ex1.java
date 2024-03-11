package com.mycompany.app.Week2.ReusingClassess;


public class Ex1 {
    public class FirstClass {
        private String message;

        public FirstClass() {
            message = "FirstClass";
            System.out.println("Khởi tạo đối tượng FirstClass");
        }

        public void displayMessage() {
            System.out.println(message);
        }
    }

    public class SecondClass {
        private FirstClass firstClassObj;

        public SecondClass() {
            System.out.println("Khởi tạo đối tượng SecondClass");
        }

        public FirstClass getFirstClassObj() {
            if (firstClassObj == null) {
                firstClassObj = new FirstClass();
            }
            return firstClassObj;
        }

        public void displayFirstClassMessage() {
            getFirstClassObj().displayMessage();
        }
    }
}