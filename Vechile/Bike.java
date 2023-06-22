/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vechile;

/**
 *
 * @author mh_sm
 */
public class Bike extends Vechile{

    public Bike() {
        super(200, 2);
    }
    
    @Override
    public void drive(){
        System.out.println("Bike");
        System.out.println("No of wheels is: " + getNumOfWheels());
    }
    
}