/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author PC - 26 316
 */
public class array_handpone {
    private String merk;
    private String tipe;
    private String warna;
    private double harga;
    private String keterangan;
    
    public array_handpone (String merk, String tipe, String warna, double harga){
        this.merk = merk;
        this.tipe = tipe;
        this.warna= warna;
        this.harga= harga;
    }
    
    public array_handpone (String merk, String tipe, String warna, String keterangan){
        this.merk = merk;
        this.tipe = tipe;
        this.warna= warna;
        this.keterangan = keterangan;
    }
    
    array_handpone(){
        merk = "Xiaomi";
        tipe = "Redmi";
        warna = "Merah";
        harga = 500000;
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
    
    public String getketerangan(){
        return keterangan;
    }
    
    public void setketerangan(String keterangan){
        this.keterangan = keterangan;
    }
    
    public void keterangan(){
        System.out.println("Setelah harga diskon: "+HargaDiskon());
    }
    
    void inputData(int index){
        JOptionPane.showMessageDialog(null,"Masukkan jumlah Hp: "+index);
        merk = JOptionPane.showInputDialog("Masukkan Merk Handhphone: ");
        tipe = JOptionPane.showInputDialog("Masukkan tipe Handhphone: ");
        warna = JOptionPane.showInputDialog("Masukkan warna Handhphone: ");
        harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan harga Handhphone: "));
    }
    
    void outputdata(){
        System.out.println("merk: "+merk);
        System.out.println("Tipe: "+tipe);
        System.out.println("Warna: "+warna);
        System.out.println("Harga: "+harga);
        keterangan();
    }
}

