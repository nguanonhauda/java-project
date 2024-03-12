package com.mycompany.app.Week2.Code2.InitializationandCleanup;

public class Ex5 {
    public void bark(){
        System.out.println("Chó nó đâng sủa .....");
    }
    public void bark(int time ){
            for ( int i = 0 ; i < time  ; i++ ) { 
            System.out.println("Sủa !! " );
    }}
    public void bark(double pitch){
        System.out.println("Chó phát ra âm thanh: " + pitch ) ; 
    }
    public void bark(boolean loud ) {
        if(loud){
            System.out.println("Chó sủa to ....");
        }
        else {
            System.out.println("Chó sủa bé ... " );
        }
    }
}
