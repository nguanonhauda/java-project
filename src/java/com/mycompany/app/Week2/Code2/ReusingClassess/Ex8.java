package com.mycompany.app.Week2.ReusingClassess;

public class Ex8 {
    class Base{
        private int value;
        public Base(int value){
            this.value = value; 
            System.out.println("Lớp cơ sở :" + value);
        }
    }
    class Deterget extends Base{
        public Deterget(){
            super(0);
            System.out.println("Lớp dẫn xuất ");
        }
        public Deterget(int value){
            super(value);
            System.out.println("không mặc định lớp dẫn xuất " + value);
        }
    }
}
