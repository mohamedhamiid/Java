/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author mh_sm
 */
public abstract class Shape {
    protected Point start ;
    
    Shape(){}
    
    Shape(Point start){
        this.start = new Point(start.getX(), start.getY());
    }
    
    
    Point getStart(){
    return start ;
    }
    
    @Override
    public String toString(){
    return "(" + start.getX() + "," + start.getY() + ")";
    }
    
    abstract public void draw();
}
