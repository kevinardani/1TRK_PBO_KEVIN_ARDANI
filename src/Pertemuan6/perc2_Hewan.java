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
public abstract class perc2_Hewan {

    private String jenis;

    perc2_Hewan(String jenis) {
        this.jenis = jenis;
    }
    protected abstract void suara();//dideklarasi , tidak di definisikan
    
    public String toString(){
        return "Seekor"+jenis;
    }
}
