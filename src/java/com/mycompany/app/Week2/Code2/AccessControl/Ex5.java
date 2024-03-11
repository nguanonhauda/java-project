package com.mycompany.app.Week2.AccessControl;

public class Ex5 {
    public int publicfile = 10 ; 
    int privatefile = 20 ; 
    protected int protectedfile = 30 ; 
    int packageAccessfile = 40 ; 

    public void publicfile () {
        System.out.println(" Phương thức public ") ;
    }

    void privatefile(){
        System.out.println(" Phương thức private"); 
    }
    protected void protectedfile(){
        System.out.println(" Phương thức protected");
    }

    void packageAccessfile(){
        System.out.println("Phương thức packgeAccess");
    }
}
