/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookLibrary;

import java.time.LocalDate;

/**
 *
 * @author mh_sm
 */
public class Book {
protected static int NoOfBooks ;
    protected int id ;
    protected String title ;
    protected java.time.LocalDate date ;
    protected double price ; 
    
    Book(){
        NoOfBooks++;
    }
    
    Book(String title , LocalDate date , double price){
        this();
        this.id = NoOfBooks ;
        this.title = title ;
        this.date = (java.time.LocalDate) date ;
        this.price = price ;  
    }
    
    
    // Accessor
    
    public void setTitle(String title){
        this.title = title ;
    }
    
    public void setDate(java.util.Date date){
        this.date = (java.time.LocalDate) date.clone() ;
    }
     
     public void setPrice(double price){
        this.price = price ;
    }
    
     public void print(){
       System.out.println(toString());
     } 
     
     
     @Override
     public String toString(){
       return "ID = " + id + "\n" + "Title = " + this.title + "\n" + "Price = " + this.price + "\n" + "Release Date = "
        + this.date.toString() + "\n";
     }
        
}
