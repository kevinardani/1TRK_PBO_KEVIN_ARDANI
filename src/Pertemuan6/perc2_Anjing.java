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
public class perc2_Anjing extends perc2_Hewan{
    private String nama;
    perc2_Anjing(String nama){
        super("Anjing");
        this.nama = nama;
    }
    
    public void suara()
    {
        System.out.println("Menggong-gong");
    }
    public String toString()
    {
        return super.toString()+""+nama;
    }
}
