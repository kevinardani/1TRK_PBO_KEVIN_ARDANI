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
public class lt_Main {
    public static void main(String[] args) {
        
        lt_Triangle segitiga = new lt_Triangle(5, 5);
        
        lt_Circle lingkaran = new lt_Circle(23);
        
        System.out.println("Luas segitiga: "+ segitiga.getArea());
        System.out.println("Luas Lingkaran: "+ lingkaran.getArea());
    }
}
