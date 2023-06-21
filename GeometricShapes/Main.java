/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GeometricShapes;
//import javafx.geometry.Point2D ;
/**
 *
 * @author mh_sm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point start = new Point(3,5);
        Point end = new Point(4,6);
        
        Line l1 = new Line(start , end);
        l1.draw();
        
        Rectangle r1 = new Rectangle(start , 3 , 5);
        r1.draw();
        
        Ellipse e1 = new Ellipse(start , 3 , 5);
        e1.draw();
    }
    
}








