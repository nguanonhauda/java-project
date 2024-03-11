//package com.mycompany.app.Week1;

public class Exercise4 {
    public void E4 () {
        
        for ( int i = 2 ; i <= 100 ; i++ ) {
            boolean isPrime = true ; 
            for ( int j = 2 ; i <= i ; j++ ) {
                if ( j % i ==0 ) {
                    isPrime = false ; 
                    break ; 
                }
            }
            if (isPrime)
            System.out.println(i);
        }
    }
}
