package com.mycompany.app.Week2.ReusingClassess;

import com.mycompany.app.Week2.ReusingClassess.Ex15.DerivedClass;
import com.mycompany.app.Week2.ReusingClassess.Ex16.Amphibian;
import com.mycompany.app.Week2.ReusingClassess.Ex16.Frog;
import com.mycompany.app.Week2.ReusingClassess.Ex18.FieldExample;
import com.mycompany.app.Week2.ReusingClassess.Ex23.ClassLoaderDemo;
import com.mycompany.app.Week2.ReusingClassess.Ex24.Ladybug;
import com.mycompany.app.Week2.*;
public class App {
    
    public static void main(String[] args) {
        // Ex1
        /*Ex1 ex1 = new Ex1();
        Ex1.SecondClass secondClass = ex1.new SecondClass();
        secondClass.displayFirstClassMessage();*/

        //Ex2
       /* Ex2 ex2 = new Ex2(); 
        NewDeterget newDeterget = ex2.new NewDeterget();
        newDeterget.scrub(); 
        newDeterget.foam();
        newDeterget.sterilize();*/


        //Ex4
        /*Ex4 ex4 = new Ex4();
        Ex4.Deterget deterget = ex4.new Deterget() ; */

        //Ex5 
        /*Ex5 ex5 = new Ex5() ; 
        Ex5.C obj = ex5.new C(); */

        /*Ex7 ex7 = new Ex7() ; 
        Ex7.C cObj = ex7.new C(12,13 ,14 );*/


        /*Ex8 ex8 = new Ex8() ; 
        Ex8.Deterget d1 = ex8.new Deterget() ; 
        Ex8.Deterget d2 = ex8.new Deterget(23) ;*/

        /*Ex9 ex9 = new Ex9() ; 
        Ex9.Stem stem = ex9.new Stem();*/

      /*  Ex10 ex10 = new Ex10() ;
        Ex10.Component1 c1 = ex10.new Component1() ; 
        Ex10.Component2 c2 = ex10.new Component2() ; 
        Ex10.Component3 c3 = ex10.new Component3() ; 

        Ex10.Stem stem = ex10.new Stem(c1, c2, c3) ;*/

        /*Ex11 ex11 = new Ex11() ; 
        Ex11.Detergent detergent = ex11.new Detergent(); 
        detergent.scrub();
        detergent.foam();
        detergent.sterilize();*/

        /*Ex12 ex12 = new Ex12();
        Ex12.Stem stem = ex12.new Stem();
        stem.dispose();*/

       /*Ex13 ex13= new Ex13();
        Ex13.Derived derived = ex13.new Derived();
        derived.overloadedMethod(10);
        derived.overloadedMethod(3.14);
        derived.overloadedMethod("Hello");
        derived.overloadedMethod(true);*/

        /*Ex14 ex14 = new Ex14() ; 
        Engine engine = new Engine(); 
        engine.service(); */  // code Ex14 lỗi ch làm được 


        /*Ex15 ex15 = new Ex15() ; 
        Ex15.DerivedClass derived = ex15.new DerivedClass();
        derived.callProtectedMethod();*/

        /*Ex16 ex16 = new Ex16() ;
        Ex16.Frog frog = ex16.new Frog();
        Amphibian amphibian = frog;
        amphibian.swim();
        amphibian.jump();
        ((Frog) amphibian).croak(); */   // có cả Ex17


        /*Ex18 ex18 = new Ex18() ; 
        System.out.println("Static final field: " + FieldExample.STATIC_FINAL_FIELD);
        Ex18.FieldExample obj = ex18.new FieldExample(200);
        System.out.println("Final field: " + obj.FINAL_FIELD);*/


        /*Ex19 ex19 = new Ex19(); 
        Ex19.MyClass obj1 = ex19.new MyClass();
        System.out.println("Final object from default constructor: " + obj1.getFinalObject());
        Ex19.MyClass obj2 = ex19.new MyClass(new Object());
        System.out.println("Final object from parameterized constructor: " + obj2.getFinalObject());*/

        /*Ex23 ex23 = new Ex23() ; 
        Ex23.ClassLoaderDemo obj1 = ex23.new ClassLoaderDemo();
        ClassLoaderDemo.accessStaticMember();*/

        Ex24 ex24 = new Ex24() ; 
        System.out.println("Ladybug constructor");
        Ex24.Ladybug ladybug = ex24.new Ladybug();








        

    }
}
