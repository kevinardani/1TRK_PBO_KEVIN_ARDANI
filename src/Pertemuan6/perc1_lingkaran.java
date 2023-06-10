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
public class perc1_lingkaran extends perc1_pola{
    
    private int jari_jari;
    
    public perc1_lingkaran(int jari_jari){
        this.jari_jari = jari_jari;
    }
    
    @Override
    public double getLuas(){
        return Math.PI * jari_jari * jari_jari;
    }
    
    public String toString() {
        return "lingkaran";
    }
}
