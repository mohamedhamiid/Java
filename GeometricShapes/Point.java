/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author mh_sm
 */
public class Point {
    
    private double x_point;
    private double y_point ;
    
    // No arg constructor
    Point(){}
    
    // Arg Const
    Point(double x , double y){
    this.x_point = x ;
    this.y_point = y ;
    }
    
    // Arg constructor
    Point(Point p){
    this.x_point = p.x_point ;
    this.y_point = p.y_point ;
    }
    
    public double getX(){
    return x_point;
    }
   
    public double getY(){
    return y_point;
    }
    
    public void setX(double x){
    x_point=x;
    }
   
    public void setY(double y){
    y_point=y;
    }
    
    public String toString(){
    return "(" + x_point + "," + y_point + ")";
    }
    
}   
