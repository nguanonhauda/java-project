package com.mycompany.app.Week2.ReusingClassess;

import com.mycompany.app.Week2.InitializationandCleanup.Ex14;
import com.mycompany.app.Week2.ReusingClassess.Ex13.Derived;

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

        Ex14 ex14 = new Ex14() ; 
        Engine engine = new Engine(); 
        engine.service(); 








        

    }
}
