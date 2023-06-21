/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diamond;

import java.awt.geom.Point2D;

/**
 *
 * @author mh_sm
 */
public class Diamond extends Shape implements Moveable , Comparable<Diamond>{
    private double length ;
    private double width ;
    
    Diamond(Point2D start , double length , double width){
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
        System.out.println("The Start of Diamond is at " + super.toString() + " The Width is " + width + " The Length is " + length);
    }
    
    @Override
    public void move(double dx,double dy){
    super.start.setLocation(start.getX()+dx, start.getY()+dy);
    }
    
    @Override
    public int compareTo(Diamond obj){
    if(start.getX()>obj.start.getX())
        return 1 ;
    else if (start.getX()<obj.start.getX())
        return -1 ;
    else{
        if(start.getY()>obj.start.getY())
            return 1 ;
        else if (start.getY()<obj.start.getY())  
            return -1 ;
        else return 0 ;
        }
    }
}

