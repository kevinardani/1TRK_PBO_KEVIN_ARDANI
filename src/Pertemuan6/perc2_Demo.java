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
public class perc2_Demo {
    public static void main(String[] args){
            perc2_Persegi persegi = new perc2_Persegi();
            persegi.setSisi(6);
            System.out.println("Keliling Persegi: "+persegi.hitungKeliling());
            System.out.println("Luas persegi: "+persegi.hitungLuas());
    }
}
