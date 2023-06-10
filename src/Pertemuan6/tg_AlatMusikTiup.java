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
public class tg_AlatMusikTiup implements tg_AlatMusik{
    private String nama;
    
    public tg_AlatMusikTiup(String nama){
        this.nama = nama;
    }
    
    @Override
    public void mainkan(){
        System.out.println("Memainkan alat musik tiup");
    }
    
    @Override
    public void setelNada(String nada){
        System.out.println("Menyetel nada" + nada + "pada alat musik tiup");
    }
    
    @Override
    public String ambilNama(){
        return nama;
    }
}
