/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vechile;

/**
 *
 * @author mh_sm
 */
public class NoFuelException extends RuntimeException{

    public NoFuelException(String message , int fuelCapacity) {
        super(message);
        System.out.print(message);
        System.out.println(fuelCapacity);
    }
    
}
