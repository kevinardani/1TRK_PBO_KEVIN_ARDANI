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
public class lt_Circle extends lt_Shape{
    private double radius;
    
    public lt_Circle(double radius){
        this.radius = radius;
    }
    
    double getArea(){
        return (float) (3.14 * radius * radius); 
    }
}
