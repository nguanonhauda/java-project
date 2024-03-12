package com.mycompany.app.Week2.Code2.InitializationandCleanup;

public class Ex14 {

    //Trường String tĩnh được khởi tạo tại điểm định nghĩa
    public static String staticField1 = "Được khởi tạo tại điểm định nghĩa " ; 

    // Trương String tĩnh được khởi tạo bởi khối tĩnh 
    public static String staticField2 ; 

    // Khối tĩnh để khởi tạo staticField2
    static{
        staticField2= "Được khởi tạo bởi khối tĩnh " ;
    }
    
    // Phương thức tĩnh để in cả 2 trương tĩnh 
    public static void pritnStaticField(){
        System.out.println("Trương tĩnh 1 : " + staticField1);
        System.out.println("Trường tĩnh 2 : " + staticField2);
    }
}
