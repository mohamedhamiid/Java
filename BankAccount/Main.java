/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BankAccount;

/**
 *
 * @author mh_sm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount ac1 = new BankAccount("Hamiid" , "2002" , 100 );
        BankAccount ac2 = new BankAccount("Mohamed" , "2020" , 200 );
        
        ac1.print();
        
        System.out.println("Balance is "+ac1.getBalance());
        
        try{
        ac1.transferTo(ac2, 50);
        
        }
        
        catch(InvalidBankingState b){
            System.out.println(b.getMessage());
        }
        
        
    }
    
}
