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
public class perc2_Burung extends perc2_Hewan {
    private String nama;
    perc2_Burung(String nama)
    {
        super("Burung");
        this.nama = nama;
    }
    
    @Override
    public void suara()
    {
        System.out.println("Berkicau");
    }
    public String toString()
    {
        return super.toString()+""+nama;
    }
}
