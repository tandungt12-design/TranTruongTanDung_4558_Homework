/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkAbstract.Exercise9;

/**
 *
 * @author ADMIN
 */
public class Processor {
    public static void main(String[] args) {
        Account a = new SavingsAccount(10000.98);
        a.display();
        System.out.println("Type: "+ a.getAccountType());
    }
}
