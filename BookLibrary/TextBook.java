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
public class TextBook extends Book{
    private int pages ;
    
    TextBook(){
        super();
    }
    
    TextBook(String title , LocalDate date , double price,int pages){
    super(title , date , price);
    this.pages=pages;
    }
    
    public void setPages(int pages){
        this.pages = pages ; 
    }
    
    public int getPages(){
        return pages ; 
    }
    
    
    @Override
    public void print(){
        System.out.println(super.toString()+toString());
   }
    
    @Override
    public boolean equals(Object obj){
        
        if(obj instanceof TextBook){
            TextBook tb = (TextBook) obj ;
            if(this.pages==tb.pages&& (this.title==tb.title) && ((((TextBook) obj).date).equals(super.date) ))
                return true ;
        }
                return false ;
    }
    @Override
        public String toString(){
            return "Pages = " + this.pages + "\n";
        }
}
