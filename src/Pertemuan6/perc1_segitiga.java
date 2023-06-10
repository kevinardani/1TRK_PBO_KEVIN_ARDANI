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
public class perc1_segitiga extends perc1_pola{
    
    private int alas, tinggi;
    
    public perc1_segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double getLuas(){
        return 0.5 * alas * tinggi;
    }
    
    public String toString(){
        return "segitiga";
    }
    
}
