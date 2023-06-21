/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @author mh_sm
 */
public class Canvas {
    ArrayList<Shape> shapes ;
    
    Canvas(){
    shapes = new ArrayList<Shape>();
    }
    
    public void addShape(Shape shape){
    shapes.add(shape);
    }
    
    public void removeShape(Shape shape){
    shapes.remove(shape);
    }
    
    public Shape getShape(Point2D point){
    double distance = 0 ;
    double minDist = Double.MAX_VALUE ; 
    Shape closeShape = null;
    for(Shape shape : this.shapes){
    distance = shape.getStart().distance(point);
        if(distance<minDist){
            minDist = distance ;
            closeShape = shape ;
        }
    }
    return closeShape;
    }
    
    public void drawAll(){
    for(Shape shape :this.shapes){
    shape.draw();
    }
    } 
}
