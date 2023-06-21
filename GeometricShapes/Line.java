/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

import java.awt.geom.Point2D;

/**
 *
 * @author mh_sm
 */
public class Line extends Shape{
    private Point2D end ;
    
    Line(Point2D start , Point2D end){
    super(start);
    this.end = end;
    }
    
    Point2D getEnd(){
    return end ;
    }
        
    @Override
    final public void draw(){
        System.out.println("The Start of line is at " + super.toString() + " The End is at ("  + end.getX() + "," + end.getY() + ")");
    }
    
}
