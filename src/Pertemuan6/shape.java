/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author PC - 26 316
 */
abstract class shape {

    public String color;
    private double area;
  
    public void Shape(String color) {

    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area){
        this.area = area;
    }
            
}
