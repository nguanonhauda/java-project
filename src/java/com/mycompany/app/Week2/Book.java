package com.mycompany.HelloWorld.Week2;


public class Book {
    public String title;
    public String author;
    public int numPages;

    // default constructor
    public Book () {
        title = "hsafua"; 
        author = " 0 author " ; 
        numPages = 0 ; 
    } 
    
    public Book(String title  , String author , int numPages){
        this.title = title ; 
        this.author = author ; 
        this.numPages = numPages ; 
    }

    public String getTitle() {
        return title ; 
    }
    
    public String getAuthor(String string) {
        return author ; 
    }
    public int getNumPages(String string) {
        return numPages ; 
    }

}