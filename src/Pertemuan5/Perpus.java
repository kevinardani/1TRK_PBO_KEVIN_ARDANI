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
public class Perpus {
    public static void main(String[] args) {
        lat2_Buku bk1 = new lat2_Buku();
        lat2_Majalah mj1 = new lat2_Majalah();
        
        bk1.setJudul("Atomic Habits");
        bk1.setKode(116242);
        bk1.setPengarang("Andrian Batu");
        bk1.setTahunterbit(2019);
        bk1.setkategori("Self Improvements");
        System.out.println("Judul buku: "+bk1.getJudul());
        System.out.println("Kode buku: "+bk1.getKode());
        System.out.println("Nama pengarang buku: "+bk1.getPengarang());
        System.out.println("Tahun buku diterbitkan: "+bk1.getTahunterbit());
        System.out.println("Jenis Kategori: "+bk1.getkategori());
        
        System.out.println("");
        
        mj1.setJudul("Republik");
        mj1.setPenerbit("James Clear");
        mj1.setTahunterbit(2020);
        mj1.setkategori("Inspirasi");
        mj1.setStok(300);
        System.out.println("Judul Majalah: "+mj1.getJudul());
        System.out.println("Penerbit Majalah: "+mj1.getPenerbit());
        System.out.println("Tahun Terbit Majalah: "+mj1.getTahunterbit());
        System.out.println("Jenis Kategori: "+mj1.getkategori());
        System.out.println("Jumlah Stok: "+mj1.getStok());
    }
}
