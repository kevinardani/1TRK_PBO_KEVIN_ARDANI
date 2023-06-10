/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author PC - 26 316
 */
public class perc_2Lingkaran {
    double jari_jari;
    final double pi=3.14;
    
    double luasLingkaran(){
        double luas=2*pi*jari_jari;
        return luas;
    }
    
    double kelLingkaran(){
        double kel=pi*jari_jari*jari_jari;
        return kel;
    }
    
    void status(){
        System.out.println("Program selesai...");
    }
}
