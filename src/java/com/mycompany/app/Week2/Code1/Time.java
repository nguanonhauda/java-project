package com.mycompany.app.Week2.Code1;

public class Time {
    int hour ; 
    int minute; 
    int second ;

    public void setHour( int h ){
        if ( h >=0 && h <= 24 ) {
            hour = h ; 
        }
        else {
            System.out.println("Error") ;
        }
    }
    public void setMinute(int m){
        if ( m >= 0 && m <= 60) {
            minute = m ; 
        }
        else {
            System.out.println("Error");
        }
    }
    public void setSecond(int s ) {
        if ( s >= 0 && s <= 60) {
            second = s ; 
        }
        else {
            System.out.println("Error");
        }
    }
    public String toString() {
        return hour + " : " + minute + " : " + second ; 
    }

}
