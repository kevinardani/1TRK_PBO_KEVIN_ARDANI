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
public class perc2_MainClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        perc_2Lingkaran objLing1=new perc_2Lingkaran();
        perc_2Lingkaran objLing2=new perc_2Lingkaran();
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jari_jari=input.nextDouble();
        
        objLing1.jari_jari=jari_jari;
        objLing2.jari_jari=jari_jari;
        
        System.out.println("Luas Lingkaran: "+objLing1.luasLingkaran());
        System.out.println("Luas Lingkaran: "+objLing2.kelLingkaran());
        objLing1.status();
    }
}
