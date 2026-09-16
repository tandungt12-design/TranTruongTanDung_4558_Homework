/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkAbstract.Exercise4;

/**
 *
 * @author ADMIN
 */
public class Circle implements IDrawable, IColorable {
    public void draw(){
        System.out.println("Circle");
    }
    public void fillColor(){
        System.out.println("Blue");
    }
}
