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
public class lat6_TestBangunDatar extends lat6_BangunDatar{
     public static void main(String[] args) {
        lat6_Persegi p1=new lat6_Persegi();
        lat6_Persegi p2=new lat6_Persegi();
        lat6_Lingkaran l1=new lat6_Lingkaran();
        lat6_Lingkaran l2=new lat6_Lingkaran();
        
        p1.nama="persegi";
        p1.sisi=6;
        l1.nama="Lingkaran";
        l1.jari_jari=5;
        
        System.out.println("Luas persegi : "+p1.luas());
        System.out.println("Luas Lingkaran : "+l1.luas());
        
        System.out.println("");
        p2.nama="Persegi";
        p2.sisi=6;
        l2.nama="Lingkarna";
        l2.jari_jari=5;
        System.out.println("Luas persegi : "+p2.Keliling());
        System.out.println("Luas Lingkaran : "+l2.Keliling());
    } 
}
    