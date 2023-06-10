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
public class perc2_TestPersegiPanjang {
    public static void main(String[] args) {
        perc2_PersegiPanjang ps1 = new perc2_PersegiPanjang();
        perc2_PersegiPanjang ps2 = new perc2_PersegiPanjang();
        perc2_PersegiPanjang pp1 = new perc2_PersegiPanjang();
        
        //Memberikan nilai pada objek 1 
        ps1.panjang=4;
        ps1.lebar=3;
        
        //memberi nilai pada objek 2
        ps2.panjang=6;
        ps2.lebar=7;
        
        //memberi nilai pada objek3
        pp1.panjang=4;
        pp1.lebar=6;
        
        //menampilkan data objek 1
        System.out.println("Persegi panjang 1");
        System.out.println("Panjang : "+ps1.panjang + " cm");
        System.out.println("Lebar : "+ps1.lebar + "cm");
        System.out.println("Luas Persegi Panjang 1: "+ps1.luas()+" cm2");
        ps1.keliling();
        
        System.out.println("");
        
        //Menampilkan data objek 2
        System.out.println("Persegi panjang 2 ");
        System.out.println("Panjang : "+ps2.panjang + " cm");
        System.out.println("Lebar : "+ps2.lebar + "cm");
        System.out.println("Luas Persegi Panjang 1: "+ps2.luas()+" cm2");
        ps2.keliling();
        
         System.out.println("");
        
        //Menampilkan data objek 3
        System.out.println("Persegi panjang 3 ");
        System.out.println("Panjang : "+pp1.panjang + " cm");
        System.out.println("Lebar : "+pp1.lebar + "cm");
        System.out.println("Luas Persegi Panjang 1: "+pp1.luas()+" cm2");
        pp1.keliling();
        
        
    }
}
