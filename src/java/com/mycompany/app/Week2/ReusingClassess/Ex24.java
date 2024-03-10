package com.mycompany.app.Week2.ReusingClassess;

public class Ex24 {
    class Beetle {
        int i = 9;
        protected int j;
    
        Beetle() {
            System.out.print("i = " + i + ", j = " + j);
            j = 39;
        }
    
        static int x3 = printInit("static Beetle.x3 initialized");
    
        static int printInit(String s) {
            System.out.println(s);
            return 47;
        }
    }
    
    // Tạo một lớp kế thừa từ lớp Beetle
    class Ladybug extends Beetle {
        int k = printInit("Ladybug.k initialized");
    
        Ladybug() {
            System.out.print("k = " + k);
            System.out.print(", j = " + j);
        }
    
        static int x4 = printInit("static Ladybug.x4 initialized");
    }
}
