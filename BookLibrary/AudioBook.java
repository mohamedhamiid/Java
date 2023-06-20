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
public class AudioBook extends Book {
    private double minutes ;
    
    AudioBook(){
        super();
    }
    
    AudioBook(String title , LocalDate date , double price,double minutes){
    super(title , date , price);
    this.minutes=minutes;
    }
    
    public void setMinutes(int minutes){
        this.minutes = minutes ; 
    }
    
    public double getMinutes(){
        return minutes ; 
    }
    
    @Override
    public void print(){
//        super.print();
//        System.out.println("Minutes is " + minutes);
        System.out.println(super.toString()+toString());
   }
   
    @Override
    public boolean equals(Object obj){
        
         if(obj instanceof AudioBook){
            AudioBook ab = (AudioBook) obj ;
            if(this.minutes==ab.minutes && (this.title==ab.title) && ((((TextBook) obj).date).equals(super.date)))
                return true ;
        }
                return false ;
        }
    @Override
        public String toString(){
            return "Minutes = " + this.minutes + "\n";
        }
    
}
