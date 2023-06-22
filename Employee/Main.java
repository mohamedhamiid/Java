/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;

/**
 *
 * @author mh_sm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WagesInterface[] arr = {new FullTimeEmployee(200),
                                new FullTimeEmployee(200),
                                new PartTimeEmployee(2,50),
                                };
        for(int i=0 ; i<3 ; i++){
            arr[i].displayInfo();
        }
    }
    
}
 interface WagesInterface {
 abstract public double calcSalary();
 abstract public void displayInfo();
 }

class FullTimeEmployee implements WagesInterface{
    private double salary ; 

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double calcSalary(){
        return salary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Salary: " + salary);
    }
    
}

class PartTimeEmployee implements WagesInterface{
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