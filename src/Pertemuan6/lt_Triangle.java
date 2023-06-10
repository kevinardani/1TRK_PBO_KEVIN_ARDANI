/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author XiaoDan
 */
public class lt_Triangle extends lt_Shape {
    private double base;
    private double height;
    
    public lt_Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    double getArea(){
        return 0.5f * base * height;
    }
}
