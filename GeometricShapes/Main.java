/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GeometricShapes;
import java.util.ArrayList;
import java.awt.geom.Point2D;
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

        
        Line l1 = new Line(new Point2D.Double(1 , 2) ,new Point2D.Double(3 , 4));
        
        Rectangle r1 = new Rectangle(new Point2D.Double(3 , 5) , 3 , 5);
        
        Ellipse e1 = new Ellipse(new Point2D.Double(4 , 6) , 3 , 5);
        
        Canvas c = new Canvas();
        
        c.addShape(r1);
        c.addShape(e1);
        c.addShape(l1);
        c.drawAll();
        
        System.out.println("\nAfter Remove Ellipse");
        c.removeShape(e1);
        c.drawAll();
        
        System.out.println("\nThe closest to (0,0) is:");
        c.getShape(new Point2D.Double(0 , 0)).draw();
    }
    
}








