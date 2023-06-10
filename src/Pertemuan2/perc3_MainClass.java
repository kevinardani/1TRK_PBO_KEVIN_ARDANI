/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author PC - 26 316
 */
public class perc3_MainClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jari_jari=input.nextDouble();
        
        perc3_Lingkaran objLing1=new perc3_Lingkaran(jari_jari);
        perc3_Lingkaran objLing2=new perc3_Lingkaran(jari_jari);
        
        System.out.println("Luas Lingkaran: "+String.format("%,.2f", objLing1.luasLingkaran()));
        System.out.println("Luas Lingkaran: "+String.format("%,.2f", objLing2.kelLingkaran()));
    }
}
