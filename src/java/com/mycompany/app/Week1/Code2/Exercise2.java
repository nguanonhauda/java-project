//package com.mycompany.app.Week1;

import java.util.Random;


public class Exercise2 {
    public void E2() {
        Random rd = new Random(); 

        //second random 
        int secondRandomVl = rd.nextInt(100) + 1 ; 
        System.out.println("Second Random : " + secondRandomVl) ; 

        int RandomVl = rd.nextInt(100) + 1 ; 

        for ( int i = 0 ; i <  25 ; i++ ) {
            if (RandomVl > secondRandomVl ) 
                System.out.println (RandomVl + " > " + secondRandomVl)  ; 
            else if ( RandomVl < secondRandomVl ) 
                System.out.println (RandomVl + " < " + secondRandomVl ) ; 
            else 
                System.out.println ( RandomVl + " = " + secondRandomVl ) ; 

        }
    }
    }

