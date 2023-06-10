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
 public class lat2_Data {
    String judul, pengarang, kategori, penerbit;
    int kode, tahunterbit, stok;

    public void judul(){
        System.out.println("Judul: ");
    }
    
    public void kode(){
        System.out.println("kode: ");
    }
    
    public void pengarang(){
        System.out.println("Pengarang: ");
    }
    
    public void tahunterbit(){
        System.out.println("tahunterbit: ");
    }
    
    public void kategori(){
        System.out.println("Jenis kategori: ");
    }
    
   //pemberian setter getter 

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(int tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getkategori(){
        return kategori;
    }
    
    public void setkategori(String Kategori){
        this.kategori = kategori;
    }
}
