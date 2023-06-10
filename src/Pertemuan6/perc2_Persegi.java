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
public class perc2_Persegi implements perc2_BangunDatar {
    
    private double sisi;
    
    public double getSisi(){
        return sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas(){
        return 4 * sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return sisi * sisi;
    }
}
