/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author PC - 26 316
 */
public class TesDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        
        dog1.type="Mammal";
        dog1.setColour("Black");
        dog1.DisplayInfo(dog1.getColour());
    }
}
