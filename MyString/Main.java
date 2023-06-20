/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MyString;

import java.util.Scanner;

/**
 *
 * @author mh_sm
 */
public class Main {

     public static void main(String[] args) {
        
        // Constructor
        MyStringBuffer passString  = new  MyStringBuffer("Hamid"); 
        passString.print();
        
        // Length
        System.out.println("The length" + " is " + passString.length());
        
        String str = new String();
        
        // Index 
        System.out.println("Please Enter Character to get index of it");
        Scanner input = new Scanner(System.in);
        str = input.next();
        char ch = str.charAt(0);
        System.out.println("The index of " + ch + " is " + passString.indexOf(ch));
        
        // Erase
        System.out.println("Please Enter Index to start erasing from:");
        int index  = input.nextInt();
        System.out.println("Please Enter Length of erasing:");
        int length = input.nextInt();
        passString.erase(index, length);
        passString.print();
        
        // Insetring
        System.out.println("Please Enter text to insert");
        String x = input.next();
        System.out.println("Please Enter Index to start inserting from:");
        int i = input.nextInt();
        passString.insert(i, x);
        passString.print();
        
    }
    
}


