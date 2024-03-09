package com.mycompany.app.Week2.AccessControl;
import com.mycompany.app.Week2.AccessControl.*;
import com.mycompany.app.Week2.AccessControl.Ex6.FirstClass;
import com.mycompany.app.Week2.AccessControl.Ex6.SecondClass;
public class App {
    private static String packageAccessfile;

    public static void main (String[] args){
        
        //Ex1
        /*Ex1 myEx1 = new Ex1(" Hello bên ngoài " ) ; 
        myEx1.hmessage();*/


        // Ex 2 
        /*Ex2 myEx2 = new Ex2(); 
        myEx2.Vector( );*/

        // Ex3 
       /*  Ex3 myEx3 = new Ex3() ; 
        myEx3.debug(null);
        myEx3.debugoff(null); */

        // Ex4 
       /* Ex4 animalEx4 = new Ex4(); 
        animalEx4.eat();
        animalEx4.makeSound(); */


        // Ex5
       /* Ex5 myojb = new Ex5();
        System.out.println("Trường : " + myojb.publicfile) ; 
        myojb.publicfile(); 

        System.out.println("Trường : " + myojb.privatefile);
        myojb.privatefile(); 

        System.out.println("Trường : " + myojb.protectedfile); 
        myojb.protectedfile();

        System.out.println("Trường : " + packageAccessfile ) ;
        myojb.packageAccessfile();
        */

        // Ex6 
      /*  Ex6 ex6 = new Ex6();
        Ex6.FirstClass firstObj = ex6.new FirstClass(10);
        Ex6.SecondClass secondObj = ex6.new SecondClass();
        
        System.out.println("Before changing protecData: " + firstObj.protecData);
        
        secondObj.setProtecData(firstObj, 20);
        
        System.out.println("After changing protecData: " + firstObj.protecData);*/

        // Ex7
        Ex7.Widget widget = new Ex7().new Widget(42) ; 
        System.out.println("Widget data : " + widget.getWidgetData());
    }




    }

