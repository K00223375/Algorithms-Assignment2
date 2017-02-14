/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author k00223375
 */
public class Employee 
{
    private int age;
    private int empNumber;
    private String firstName;
    private String lastName;
    
    public Employee(int empNum, String lName, String fName, int age)
    {
        this.empNumber = empNum;
        this.lastName = lName.toUpperCase();
        this.firstName = fName;
        this.age = age;
    }
    
    public Employee() 
    {
        this.empNumber = 123;
        this.lastName = "Bush".toUpperCase();
        this.firstName = "Bob";
        this.age = 45;
    }
    
    
    public String printEmployeeDetails() 
    {
        String emplInfo = "";
        
        emplInfo += this.empNumber + "\t";
        emplInfo += this.lastName + "\t";
        emplInfo += this.firstName + "\t";
        emplInfo += this.age;
        return emplInfo;
    }
    
    
}
