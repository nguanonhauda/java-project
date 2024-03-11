package com.mycompany.app.Week3.Code2;

public class Exercise17Polymorphism {
    class Cycle {
        public void ride() {
            System.out.println("Đang lái xe đạp");
        }
    }

    class Uncycle extends Cycle {
        public void balance() {
            System.out.println("Cân bằng trên một bánh");
        }
    }

    class Bycycle extends Cycle {
        public void balance() {
            System.out.println("Cân bằng trên xe 2 bánh");
        }
    }

    class Tricucle extends Cycle {
        // Không có phương thức balance
    }
}