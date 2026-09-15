/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkAbstract.Exercise2;

import HomeworkAbstract.*;

/**
 *
 * @author ADMIN
 */
public abstract class Employee {
    private String name;
    Employee(String a){
        this.name= a;
    }
    public void displayInfor(){
        System.out.println("Name: "+ name);
    }
    public abstract double caculateSalary();
}
