package ItemsForSale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import ItemsForSale.Apartments;
import ItemsForSale.ItemsForSale;

/**
 *
 * @author Lenovo
 */


public class main {
        public static void main(String[]args){
        ItemsForSale[] items={
        new Apartments(50,"first", 500000),
        new Apartments(100, "second", 550000),
        new Apartments(100, "third", 999999999),
        new Apartments(250, "fourth", 400000),
        new Apartments(300, "fifth", 77000),
        };
        
        for (int i=0;i<items.length;i++){
            if(items[i].isGoodDeal()==true)
                System.out.println("Item "+ (i+1) + " is a good deal"); 
            else
                System.out.println("Item "+ (i+1) + " is not a good deal"); 
        }
                System.out.println("Average Price = " + Apartments.getAvgPrice()); 
        }
}