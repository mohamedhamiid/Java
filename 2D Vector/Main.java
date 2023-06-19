/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

/**
 *
 * @author mh_sm
 */
public class Main {

    public static void main(String[] args) {
        // Default Constructor
        Vector v1 = new Vector(); 
        System.out.println("Vector with Default Constructor");
        v1.print();
        System.out.println("\n");
        
        // Non empty constructor
        Vector v2 = new Vector(2,5); 
        System.out.println("Vector with non-empty constructor x = 2 , y = 5");
        v2.print();
        System.out.println("\n");
        
        // Getters
        System.out.println("x component of " );
        v2.print();
        System.out.println("= " + v2.getX());
        System.out.println("\n");
        
        System.out.println("y component of " );
        v2.print();
        System.out.println("= " + v2.getY());
        System.out.println("\n");
        
        // Setters
        v2.setX(8);
        v2.setY(9);
        System.out.println("After Setting x = 8 , y = 9 " );
        v2.print();
        System.out.println("\n");
        
        // Magnitude
        System.out.print("Magnitude of "); 
        v2.print();
        System.out.println("= " + v2.mag());
        System.out.println("\n");
        
        // Angle
        System.out.print("Angle of "); 
        v2.print();
        System.out.print("= " + Math.toDegrees(v2.angle()));
        System.out.println("\n");
        
        // Add and sub
        Vector v3 = new Vector(10,11);
        Vector res = new Vector();
        System.out.println("Add of "); 
        v2.print();
        System.out.println("+ "); 
        v3.print();
        System.out.print("= "); 
        res = v2.add(v3);
        res.print();
        System.out.println("\n");
        
        System.out.println("Sub of "); 
        v2.print();
        System.out.println("- "); 
        v3.print();
        System.out.print("= "); 
        res = v2.sub(v3);
        res.print();
        System.out.println("\n");
        
        // Average 
        Vector [] arr = {new Vector(3,4) ,
                         new Vector(6,8) ,
                         new Vector(9,12) };
        
        System.out.println("Average of magnitudes of :");
        arr[0].print();
        arr[1].print();
        arr[2].print();
        System.out.print("= " + "(" + arr[0].mag() + " + " + arr[1].mag() + " + " + arr[2].mag() + ")" + " / " + 
                         arr.length + " = " + Vector.average(arr));

    }
   
}

