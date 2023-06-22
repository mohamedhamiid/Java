/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IntegerCalculatorUsingExceptionHandler;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author mh_sm
 */
public class SimpleCalculatorUsingExceptionHandler{
    public static void main(String[] args) {
        // TODO code application logic here
    int IncorrectInput=1;
    int in1=0 , in2=0 ;
    Scanner input = new Scanner(System.in);
    
    do{
        try{
        System.out.println("Please Enter Two Integers");
        in1 = input.nextInt();
        in2 = input.nextInt();
        IncorrectInput=0;
        }
        
        catch(InputMismatchException incorrectIn){
            System.out.println("Incorrect");
            input.nextLine();
        }
        
        
    }while(IncorrectInput==1);
    
    System.out.println("add is:");
    System.out.println(add(in1,in2));
    System.out.println("sub is:");
    System.out.println(sub(in1,in2));
    System.out.println("product is:");
    System.out.println(product(in1,in2));
    
    try{
    System.out.println("division is:");
    System.out.println(division(in1,in2));
    }
    
    catch(InputMismatchException error){
    System.out.println(error);
    }
    
    try{
    System.out.println("reminder is:");
    System.out.println(reminder(in1,in2));
    }
    
    catch(InputMismatchException error){
    System.out.println(error);
    }
    
    }
    
    
     public static int add(int n1 , int n2){
     return n1+n2;
     }
     
     public static int sub(int n1 , int n2){
     return n1+n2;
     }
     
     public static int product(int n1 , int n2){
     return n1*n2;
     }
     
     public static int reminder(int n1 , int n2) throws InputMismatchException{
     if(n2!=0) return n1%n2;
     else if(n2==0) throw new InputMismatchException ("0");
     return 0;
     }
     
     public static double division (int n1 , int n2) throws InputMismatchException{
     if(n2!=0) return n1/n2;
     else if (n1==0) throw new InputMismatchException ("Undefined Quantity");
     else if (n1>0) throw new InputMismatchException ("+infinity");
     else if (n1<0) throw new InputMismatchException ("-infinty");
     return 0;
     }
}   
