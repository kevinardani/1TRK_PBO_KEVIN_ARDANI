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
public class perc1_persegipanjang extends perc1_pola {
    
    private int panjang, lebar;
    
    public perc1_persegipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    @Override
    public double getLuas(){
        return panjang * lebar;
    }
    
    public String toString() {
        return "persegi panjang";
    }
}
