/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author mh_sm
 */
public class BankAccount {
    String  accNum ; 
    String  accOwner ;
    float   balance ;
    boolean closedOpen ; 

    public BankAccount( String  accOwner ,String  accNum ,float balance) {
        this.balance = balance;
        this.closedOpen = closedOpen;
        this.accOwner = new String (accOwner) ;
        this.accNum = new String (accNum) ; 
        closedOpen = true ;
    }
    
    public void print(){
        System.out.println("Account Number is: " + accNum + "\nAccount Owner is: " + accOwner + "\nBalance is:" + balance);
        if(closedOpen==true) System.out.println("Open");
        else if(closedOpen==false) System.out.println("Closed");   
    }

    public float getBalance() {
        return balance;
    }
    
    public void close (){
        if(this.balance==0&&this.closedOpen==true)
           this.closedOpen = false ; 
        else 
            throw new InvalidBankingState("Can't Close");
    }   
    
    public void reopen (){
        if(this.closedOpen==false)
           this.closedOpen = true ; 
        else 
            throw new InvalidBankingState("Can't Reopen");
    }
    
    public void deposit (float amount){
        if(amount>0 && closedOpen == true)
           this.balance += amount ; 
        else 
            throw new InvalidBankingState("Can't Deposit");
    }
    
    public void withdraw (float amount){
        if(amount>0 && amount <= balance && closedOpen == true)
           this.balance -= amount ; 
        else 
            throw new InvalidBankingState("Can't Withdraw");
    }
    
    public void transferTo(BankAccount a, float amount){
        if(amount>0 && amount <= balance && closedOpen == true){
           a.balance += amount ; 
           this.balance -= amount ; 
        }
        else 
            throw new InvalidBankingState("Can't Transfer");
    }
    
    static public void printAll(BankAccount[] as){
        for(int i=0 ; i<as.length ; i++){
            System.out.println("Account" + (i+1) +" :");
            as[i].print();
        }
    }
    
    static public int find(BankAccount[] as, String accountNum){
        for(int i = 0 ; i < as.length ; i++)
            if(as[i].accNum == accountNum) return i ;
        return -1 ;
    }
    
}