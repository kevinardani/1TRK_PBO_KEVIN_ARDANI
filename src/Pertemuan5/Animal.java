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
public class Animal {

    private String colour;
    protected String type;

    public void eat() {
        System.out.println("I can Eat");
    }
    
    public void sleep() {
        System.out.println("I can Sleep");
    }
    
    public String getColour(){
        return colour;
    }
    
    public void setColour(String colour){
        this.colour = colour;
        
    }
}
