/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkAbstract.Exercise3;

/**
 *
 * @author ADMIN
 */
public class Report implements IPrintable {
    private String title;
    Report(String t){
        this.title= t;
    }
    public void print(){
        System.out.println(this.title);
    }
}
