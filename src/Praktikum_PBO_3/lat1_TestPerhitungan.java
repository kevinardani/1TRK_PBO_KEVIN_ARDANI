/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author XiaoDan
 */
public class lat1_TestPerhitungan {

    public static void main(String[] args) {
        lat1_perhitungan hitung = new lat1_perhitungan();
        int a = 5;
        int b = 3;
        double c = 2.5;
        double d = 1.5;
        System.out.println("Hasil penjumlahan " + a + " dan " + b + " adalah " + hitung.penjumlahan(a, b));
        System.out.println("Hasil pengurangan " + a + " dan " + b + " adalah " + hitung.pengurangan(a, b));
        System.out.println("Hasil penjumlahan " + c + " dan " + d + " adalah " + hitung.penjumlahan(c, d));
        System.out.println("Hasil pengurangan " + c + " dan " + d + " adalah " + hitung.pengurangan(c, d));
    }
}
