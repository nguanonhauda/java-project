package test.java.com.mycompany.app;

public class Note {
    String a ; 
public Note (){
    a = " A ,B,Middle_C.D.E.F" ; 
}
public static void main(String[] args) {
    Note myNote = new Note() ;
    System.out.println(myNote.a) ;
}}
