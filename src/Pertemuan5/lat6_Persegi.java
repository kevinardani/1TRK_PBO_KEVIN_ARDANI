/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author XiaoDan
 */
public class lat6_Persegi extends lat6_BangunDatar {
    String nama;
    double sisi;
    
    public lat6_Persegi(String nama,double sisi){
        this.nama=nama;
        this.sisi=sisi;
    }
    
    public lat6_Persegi(){
        this.sisi=0;
    }
    
    @Override
    public double luas(){
        super.luas();
        return sisi*sisi;
    }
    
    public double Keliling(){
        super.keliling();
        return sisi *sisi *sisi *sisi;
    }
}
