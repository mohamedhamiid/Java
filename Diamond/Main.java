package Diamond;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.util.Arrays;
/**
 *
 * @author mh_sm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diamond d1 = new Diamond(new Point2D.Double(3 , 5) , 3 , 5);
        d1.draw();
        d1.move(5, 4);
        System.out.println("\nAfter Movement " + "dx = 5 " + "dy = 4");
        d1.draw();
        
        Moveable [] move = {
        new Diamond(new Point2D.Double(3 , 1) , 3 , 5),
        new Diamond(new Point2D.Double(1 , 2) , 3 , 5),
        new Diamond(new Point2D.Double(3 , 4) , 3 , 5)
        };
        
        System.out.println("\nBefore Move");
        for(Moveable m : move){
            ((Diamond) m).draw();
        }
        
        System.out.println("\nAfter Move dx = 1 , dy = 2");
        for(Moveable m : move){
            ((Diamond) m).move(1,2);
        }
        for(Moveable m : move){
            ((Diamond) m).draw();
        }
        
        System.out.println("\nAfter Sorting");
        Arrays.sort(move);
        for(Moveable m : move){
            ((Diamond) m).draw();
        }
        
        
    }
    
}