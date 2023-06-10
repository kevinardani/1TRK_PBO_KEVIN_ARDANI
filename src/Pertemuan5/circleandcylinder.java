/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author XiaoDan
 */
public class circleandcylinder {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        cylinder c5 = new cylinder();
        circle c3 = new circle();
        circle c2 = new circle();
        circle c4 = new circle();
        
        
        System.out.println("Radius: "+c3.getRadius());
        System.out.println("Color: "+c2.getColor());
        System.out.println("Area: "+c4.getArea());
        System.out.println("Height: "+c5.getHeight());
        System.out.println("Volume: "+c1.getVolume());
    }
}
