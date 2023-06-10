/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author PC - 26 316
 */
public class TestBurung {
    public static void main(String[] args) {
        Murai murai1 = new Murai();
        Beo beo1 = new Beo();
        
        murai1.terbang();
        beo1.terbang();
        murai1.bersiul();
        beo1.bersiul();
        
        murai1.jenis = "Batu";
        beo1.jenis = "dkdkd";
        
    }
}
