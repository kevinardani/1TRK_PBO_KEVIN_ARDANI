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
public class lat6_Lingkaran extends lat6_BangunDatar{
      String nama;
    double jari_jari;
    final double pi=3.14;
    
    public lat6_Lingkaran(String nama,double jari_jari){
        this.nama=nama;
        this.jari_jari=jari_jari;
    }
    
    public lat6_Lingkaran(){
        this.jari_jari=0;
    }
    
    @Override
    public double luas(){
        super.luas();
        return pi *jari_jari *jari_jari;
    }
    
    public double Keliling(){
        super.keliling();
        return 2 * pi*jari_jari;
    }
}
