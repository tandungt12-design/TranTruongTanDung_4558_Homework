/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkAbstract.Exercise9;

/**
 *
 * @author ADMIN
 */
public class SavingsAccount extends Account {
    SavingsAccount(double b){
        super(b);
    }
    String getAccountType(){
        return "Saving Account";
    }
}
