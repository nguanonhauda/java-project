package com.mycompany.app.Week2.ReusingClassess;

public class Ex23 {
    class ClassLoaderDemo {
        static {
            System.out.println("Class loaded!");
        }
        public static void accessStaticMember() {
            System.out.println("Static member accessed!");
        }
    }
}
