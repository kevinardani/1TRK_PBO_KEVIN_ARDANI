/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

public class circle {
   private double radius;
    private String color;
    
    public circle() {
        radius = 1.0;
        color = "red";
    }
    public circle(double radius) {
        this.radius = radius;
    }
    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
   @Override
    public String toString() {
        return  + radius + color ;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
