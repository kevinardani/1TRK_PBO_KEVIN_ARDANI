/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

public class cylinder extends circle{
  private double height;
    public cylinder() {
        super();
        height = 1.0;
    }
    public cylinder(double height) {
        super();
        this.height = height;
    }
    public cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return +height+ super.toString();
    }
    public double getVolume() {
        return getArea() * height;
    }
}
