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
public class Processor {
    public static void main(String[] args) {
        Employee a = new FullTimeEmployee("Dung", 500000);
        a.displayInfor();
        System.out.println(a.caculateSalary());
    }
}
