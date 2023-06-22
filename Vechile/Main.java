/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vechile;

import Vechile.Bike;
import Vechile.Car;
import Vechile.NoFuelException;
import Vechile.Vechile;

/**
 *
 * @author mh_sm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vechile [] arr = {new Car(10),new Bike()};
    
    try{
        arr[0].drive();
        arr[1].drive();
    }catch(NoFuelException ex){
        System.out.println(ex.getMessage());
    }
    
    
    }
     
}








