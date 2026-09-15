/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkAbstract.Exercise9;

/**
 *
 * @author ADMIN
 */
public abstract class Account {
    protected double balance;
    Account(double a)
    {
        this.balance= a;
    }
    abstract String getAccountType();
    public void display()
    {
        System.out.println("Balance: "+ this.balance);
    }
}
