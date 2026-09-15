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
public class FullTimeEmployee extends Employee {
    private double salary;
    FullTimeEmployee(String a, double b){
        super(a);
        this.salary= b;
    }
    public double caculateSalary(){
        return this.salary;
    }
}
