/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author mh_sm
 */
public class PartTimeEmployee implements WagesInterface{
    private double ratePerHour ; 
    private int hoursWorked ; 

    public PartTimeEmployee(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    
    
    @Override
    public double calcSalary(){
        return ratePerHour*hoursWorked;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Salary: " + calcSalary());
    }
    
}
