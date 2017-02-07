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
    
    public Employee(int empNum, String fName, String lName, int age)
    {
        this.empNumber = empNum;
        this.firstName = fName;
        this.lastName = lName.toUpperCase();
        this.age = age;
    }
    
    public Employee() 
    {
        this.empNumber = 123;
        this.firstName = "Bob";
        this.lastName = "Bush".toUpperCase();
        this.age = 21;
    }
    
    
    public String printStudentDetails() 
    {
        String studentInfo = "";
        String studentExams="";
        
        studentInfo += "ID = " + this.empNumber + "\n";
        studentInfo += "FName = " + this.firstName + "\n";
        studentInfo += "LName = " + this.lastName + "\n";
        studentInfo += "Age = " + this.age + "\n";
        return studentInfo;
    }
    
    
}
