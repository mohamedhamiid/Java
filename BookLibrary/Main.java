/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BookLibrary;
import java.util.Scanner ;
import java.time.LocalDate;

/**
 *
 * @author mh_sm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please Enter Number of books");
        Scanner input = new Scanner(System.in);
        
        // Input Books By User
        int n = input.nextInt();
        Book [] bookArr = new Book[n];
        
        for(int i = 0 ; i < n ; i++){
        System.out.println("Enter Book " + (i+1) +" specifications");
        bookArr[i]= readbook();
        }
        
        // Print details of each book
        for(int i = 0 ; i < n ; i++){
        System.out.println("Properties of Book " + (i+1) + " ");
        bookArr[i].print();
        }
        
        // Compare 2 books 
        int id1 = 0 , id2 = 0;
        System.out.println("Enter ID of Two Books To Compare ");
        id1 = input.nextInt();
        id2 = input.nextInt();
        System.out.println(bookArr[id1].equals(bookArr[id1]));
    }
    
    static Book readbook(){
        // Select Text or Audio
        System.out.println("1-->Textbook || 2--> Audiobook");
        Scanner input = new Scanner(System.in);
        int bookType=input.nextInt();
        String title ; int day ; int month ; int year ; double price ; int pageno ; double minutes ;
        
        // Input Title
            System.out.println("Please Enter Title of book");
            title=input.next();
            
        // Input Date
            System.out.println("Please Enter Release Date of book (day-month-year)");
            day =input.nextInt();
            month =input.nextInt();
            year =input.nextInt();
            
        // Input Price
            System.out.println("Please Enter Price of book");
            price= input.nextDouble();
        
        // Input number of pages if it's textbook
        if(bookType==1){
            System.out.println("Please Enter No of pages of book");
            pageno=input.nextInt();
            
            TextBook textbook = new TextBook( title , LocalDate.of(year, month , day) , price , pageno);
            return textbook ;
        }
        else if(bookType==2){
            
            System.out.println("Please Enter Minutes of book");
            minutes=input.nextInt();
            AudioBook audiobook = new AudioBook(title , LocalDate.of(year, month , day) , price , minutes);
            return audiobook ;
        }
        return null ;
    } 
}

    


    

