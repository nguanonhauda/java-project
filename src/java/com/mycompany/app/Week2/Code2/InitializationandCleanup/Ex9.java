package com.mycompany.app.Week2.InitializationandCleanup;

public class Ex9 {
    private int value ; 
    
    // Hàm khởi tạo đầu tiên
    public Ex9() {
        this(0); 
    }

    // Hàm khởi tạo thứ hai
    public Ex9(int value){
        this.value = value ;
    }

    public int getValue(){
        return value ; 
    }
}