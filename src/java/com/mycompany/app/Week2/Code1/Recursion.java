package com.mycompany.app.Week2.Code1;

import java.util.Scanner  ; 

public class Recursion {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ;
        int giaThua = 1 ; 
        for ( int i = 1 ; i <= n ; i++ ) {
            giaThua *= i ; 
        }
        System.out.print(giaThua) ; 
    }
    
}