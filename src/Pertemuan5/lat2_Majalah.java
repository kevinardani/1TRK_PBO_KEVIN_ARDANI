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
public class lat2_Majalah extends lat2_Data {
    String penerbit;
    int stok;
    
    @Override
    public void judul(){
        System.out.println("Judul Majalah: ");
    }
    
    public void penerbit(){
        System.out.println("Penerbit Majalah: ");
    }
    
    @Override
    public void tahunterbit(){
        System.out.println("Tahun majalah terbit: ");
    }
    
    @Override
    public void kategori(){
        System.out.println("Jenis kategori majalah: ");
    }
    
    public void stok(){
        System.out.println("Jumlah Stok: ");
    }
}
