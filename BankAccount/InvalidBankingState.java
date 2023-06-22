/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author mh_sm
 */
public class InvalidBankingState extends RuntimeException {
    public InvalidBankingState(String message) {
        super(message);
    }  
}

