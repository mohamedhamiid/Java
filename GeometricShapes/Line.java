/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author mh_sm
 */
public class Line extends Shape{
    private Point end = new Point() ;
    
    Line(Point start , Point end){
    super(start);
    this.end = end;
    }
    
    Point getEnd(){
    return end ;
    }
        
    @Override
    final public void draw(){
        System.out.println("The Start of line is at " + super.toString() + " The End is at"  + end.toString());
    }
    
}
