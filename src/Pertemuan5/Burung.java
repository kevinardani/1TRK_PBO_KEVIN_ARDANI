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
public class Burung {
    private String warna;
    String jenis;
    
    public void terbang(){
        System.out.println("Burung Bisa Terbang");
    }
    
    public void bersiul(){
        System.out.println("Burung Bisa Bersiul");
    }
    
    public String getwarna(){
        return warna;
    }
    
    public void setwarna(String warna){
        this.warna = warna;
    }
}
