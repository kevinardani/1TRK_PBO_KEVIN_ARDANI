/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author PC - 26 316
 */
public class handhphone {
    private String merk;
    private String tipe;
    private String warna;
    private double harga;
    
    public handhphone (String Merk, String tipe, String Warna, double harga){
        this.merk = merk;
        this.tipe = tipe;
        this.warna= warna;
        this.harga= harga;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double HargaDiskon(){
        harga = harga - (0.1*harga);
        return harga;
    }
    
    public void Ket(){
        System.out.println("Setelah harga diskon: "+HargaDiskon());
    }
}
