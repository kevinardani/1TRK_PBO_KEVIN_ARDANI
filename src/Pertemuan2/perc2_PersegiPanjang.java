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
public class perc2_PersegiPanjang {
    double panjang;
    double lebar;
    
    double luas(){
        double ls;
        ls = panjang *lebar;
        return ls;
    }
    
    void keliling(){
        double kl1;
        kl1=(2*panjang)+(2*lebar);
        System.out.println("Keliling Persegi Panjang : "+kl1);
    }
}
