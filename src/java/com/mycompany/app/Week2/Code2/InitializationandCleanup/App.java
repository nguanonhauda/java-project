package com.mycompany.app.Week2.Code2.InitializationandCleanup;

public class App {

    public static void main (String[] args) {
    // Ex 1 
   /* Ex1 obj = new Ex1(); 
    obj.printString() ;  */ 

    // Ex2 
    /*Ex2 obj = new Ex2(); 
    obj.printString1(); */ 


    // Ex3 
  /*  Ex3 obj = new Ex3() ; 
    obj.defaultConstructor(); */

    // EX4 
    /*Ex4 obj1 = new Ex4();
    Ex4 obj2 = new Ex4() ; 
    obj1.DefaultConstructor();
    obj2.DefaultConstructor("Hello World? ");*/

    //Ex5 
    /*Ex5 dog = new Ex5(); 
    dog.bark();
    dog.bark(35);
    dog.bark(4.4); 
    dog.bark(true) ;*/ 

    //Ex6
    /*Ex6 dog = new Ex6() ;
    dog.bark();
    dog.bark(4);
    dog.bark(4.5);
    dog.bark(true,5);
    dog.bark(4, false);*/


    //Ex7
    /*Ex7 obj = new Ex7() ; 
    obj.displayMessage();*/
    

    //Ex8
    /*Ex8 obj = new Ex8() ; 
    obj.method1();*/


    // Ex9 
    /*Ex9 objClass1 = new Ex9();
    Ex9 objClass2 = new Ex9(8); 
    System.out.println("Giá trị của class1 : " + objClass1.getValue());
    System.out.println("Giá trị của class2 : " + objClass2.getValue()); */

    // Ex10 , 11
    /*Ex10 obj = new Ex10() ; 
    obj.finalize();*/

    // Ex12 
    /*Ex12 myTank = new Ex12(); 
    // Kiểm tra 
    myTank.fill();//Đổ nc vào bình 
    myTank.empty();// Bình rỗng 
    myTank.finalize();*/


    // Ex14 
    //Ex14.pritnStaticField();


    // Ex 15 
   /* Ex15 obj = new Ex15() ; 
    System.out.println("Chỗi đã được khởi tạo : " + obj.getMyString()); */


    // Ex16 
    /*Ex16 myArr = new Ex16(); 
    myArr.printStringArr();*/

    // Ex17 
    /*Ex17[] arry = new Ex17[5] ; 
    for ( int i = 0 ; i < arry.length ; i++ ){
    System.out.println("Phan tử " + i + " : " + arry[i]) ; 
    }*/

   /* Ex18[] array = new Ex18[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Ex18("Đối tượng " + (i + 1)); 
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử " + i + ": " + array[i]);
        }*/

    // Ex19 
    // Truyền vào chuỗi phân tách 
   /* Ex19.printStrings("Táo" , "Nho" , "Dâu tây"); 

    // Truyền mảng vào String 
    String[] hoaQua = {"Táo" , "Nho" , "Dâu tây"} ; 
    Ex19.printStrings(hoaQua) ; */

    //Ex20
    /*Ex20 myEx20 = new Ex20() ; 
    String[] tuoi = {"4" , "48"};
    myEx20.printArgs(tuoi);*/

    // Ex21
    /*Ex21 myEx21 = new Ex21() ; 
    myEx21.printCurrency(); */

    //Ex22
    Ex22 myEx22 = new Ex22() ; 
    myEx22.printCurrency2(Ex22.Type.DOLLAR);
    myEx22.printCurrency2(Ex22.Type.EURO);
    myEx22.printCurrency2(Ex22.Type.POUND);
    myEx22.printCurrency2(Ex22.Type.YEN);
    myEx22.printCurrency2(Ex22.Type.VND);
}
}