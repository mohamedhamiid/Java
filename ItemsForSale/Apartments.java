/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItemsForSale;


/**
 *
 * @author mh_sm
 */
public class Apartments extends ItemsForSale{
    private double area;
    static private double totalPrice;
    static private double avgPrice;
    static private int counter;

    public Apartments(){
    }

    public Apartments(double area, String itemName, int price) {
        super(itemName, price);
        this.area = area;
        totalPrice += price ; 
        counter++;
        this.avgPrice = totalPrice / counter ;
    }

    
    public boolean isGoodDeal() {
        if (getPrice()<(avgPrice*area)){
            return true;
            
        }
        return false;
    }

    public static double getAvgPrice() {
        return avgPrice;
    }
    
    
}
