/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vechile;

/**
 *
 * @author mh_sm
 */
public class Car extends Vechile{
    private int fuelCapacity; 

    public Car (int fuelCapacity){
        super();
        this.fuelCapacity = fuelCapacity;
    }
    
    @Override
    public void drive(){
        if (fuelCapacity>=5) {fuelCapacity -= 5; System.out.println("Fuel Capacity is :" + fuelCapacity);}
        else 
            throw new NoFuelException("Fuel Capacity Low is: " , fuelCapacity );
    }
    
}
