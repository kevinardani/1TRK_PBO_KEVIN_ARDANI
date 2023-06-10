/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author PC - 26 316
 */
public class perc2_TestMajalah {
    public static void main(String[] args) {
        perc2_Majalah m1 = new perc2_Majalah();
        perc2_Majalah m2 = new perc2_Majalah();
        
        m1.nama="Tempo";
        m2.nama="Aneka Yes";
        
        m1.info();
        m2.info();
        
        perc2_Majalah m3 = new perc2_Majalah();
        
        m3.tambahan("Dimas Mabar");
    
    }
}
