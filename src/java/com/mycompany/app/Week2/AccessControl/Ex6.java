package com.mycompany.app.Week2.AccessControl;

public class Ex6 {
    
    public class FirstClass{
        int protecData;
        
        public FirstClass(int protecData) {
            this.protecData = protecData;
        }
    }

    public class SecondClass{
        public void setProtecData(FirstClass obj, int newData){
            obj.protecData = newData; 
            System.out.println("Đây là Secondclass"); 
        }
    }
}