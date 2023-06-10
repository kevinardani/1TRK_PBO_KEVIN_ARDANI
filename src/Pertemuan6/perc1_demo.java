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
public class perc1_demo {
    public static void main(String[] args) {
        perc1_persegipanjang pp = new perc1_persegipanjang(5, 3);
        System.out.println("Luas Persegi Panjang : ");
        System.out.println(pp.getLuas()+ "cm");
        
        perc1_segitiga segi = new perc1_segitiga(6, 8);
        System.out.println("Luas Segitiga : ");
        System.out.println(segi.getLuas()+ "cm");
        
        perc1_lingkaran ling = new perc1_lingkaran(10);
        System.out.println("Luas Lingkaran : ");
        System.out.println(ling.getLuas()+ "cm");
        
        
    }
}
