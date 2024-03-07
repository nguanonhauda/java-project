//package com.mycompany.app.Week1;

import java.util.Random;


public class Exercise3 {
        public void E3() {
        Random rd = new Random(); 

        //second random 
        int secondRandomVl = rd.nextInt(100) + 1 ; 
        System.out.println("Second Random : " + secondRandomVl) ; 

        int RandomVl = rd.nextInt(100) + 1 ; 

        while  ( true ) {
            if (RandomVl > secondRandomVl ) 
                System.out.println (RandomVl + " > " + secondRandomVl)  ; 
            else if ( RandomVl < secondRandomVl ) 
                System.out.println (RandomVl + " < " + secondRandomVl ) ; 
            else 
                System.out.println ( RandomVl + " = " + secondRandomVl ) ; 

        }
    }
}

