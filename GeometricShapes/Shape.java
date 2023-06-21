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
public abstract class Shape {
    protected Point2D start  ;
    
    Shape(){}
    
    Shape(Point2D start){
        this.start = start;
    }
    
    
    Point2D getStart(){
    return start ;
    }
    
    @Override
    public String toString(){
    return "(" + start.getX() + "," + start.getY() + ")";
    }
    
    abstract public void draw();
}
