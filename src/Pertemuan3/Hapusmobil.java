/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

public class Hapusmobil {
    String warna; 
    String merek; 
    
    public Hapusmobil(){
        this.warna = "";
        this.merek = "";
    }
    
    public void setMerek(String merek){
        this.merek = merek; 
    }
    
    void beriWarna(){
        System.out.println("Warna mobil ini adalah "+warna);
    }
    
    void beriMerek(){
        System.out.println("Merek mobil ini adalah "+merek);
    }
}
