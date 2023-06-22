/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vechile;

/**
 *
 * @author mh_sm
 */
public abstract class Vechile{
    
    private float speed ; 
    private int numOfWheels;

    public Vechile() {
    }
    
    public Vechile(float speed, int numOfWheels) {
        this.speed = speed;
        this.numOfWheels = numOfWheels;
    }
    
    abstract public void drive();

    public int getNumOfWheels() {
        return numOfWheels;
    }  
}
