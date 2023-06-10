
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
public class lat2_PersegiPanjang {
    private double panjang;
    private double lebar;

    public lat2_PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public String toString() {
        return "PersegiPanjang dengan panjang " + panjang + " dan lebar " + lebar +
                "\nLuas: " + hitungLuas() + "\nKeliling: " + hitungKeliling() + "\n";
    }
}
