/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author mh_sm
 */
public class Rectangle extends Shape{
    private double length ;
    private double width ;
    
    Rectangle(Point start , double length , double width){
    super(start);
    this.length = length ;
    this.width = width ;
    }
    
    double getLength(){
    return length ;
    }
    
    double getWidth(){
    return width ;
    }
        
    @Override
    final public void draw(){
        System.out.println("The Start of Rectangle is at " + super.toString() + " The Width is " + width + " The Length is " + length);
    }
    
}
