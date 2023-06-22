/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ItemsForSale;

/**
 *
 * @author mh_sm
 */
public abstract class ItemsForSale {
    private String itemName;
    private int price;

    public ItemsForSale() {
    }
    
    public ItemsForSale(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public abstract boolean isGoodDeal();

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
    
    
    
}
