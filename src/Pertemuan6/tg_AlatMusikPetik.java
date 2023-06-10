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
public class tg_AlatMusikPetik implements tg_AlatMusik{
    private String nama;
    
    public tg_AlatMusikPetik(String nama){
        this.nama = nama;
    }
    
    @Override
    public void mainkan(){
        System.out.println("Mainkan alat Mustik Petik");
    }
    
    @Override
    public void setelNada(String nada){
        System.out.println("Meneyetel nada" + nada + "pada alat musik petik");
    }
    
    @Override
    public String ambilNama(){
        return nama;
    }
}
