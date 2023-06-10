/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

import javax.swing.JOptionPane;

/**
 *
 * @author PC - 26 316
 */
public class CobaJoptionpane {
    public static void main(String[] args){
        //Parsing digabungkan 1 baris 
        int bilangan1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan 1"));
        //ini jika dipisah parsingnya 
        String bilangan2 = JOptionPane.showInputDialog("Masukkan Bilangan 2");
        
        int hasil = bilangan1 + Integer.parseInt(bilangan2);
        //lihat! Parseint untuk tipe data integer -> parsing bilangan2 dari String menjai int 
        
        //Output menggunakan println 
        System.out.println("Hasil Penjumlahan adalah "+hasil);
        //Output dengan JOptionPane
        JOptionPane.showMessageDialog(null, "hasil Penjumlahan"+hasil);
        
        JOptionPane.showMessageDialog(null, "hasil Tanpa Parsing "+(bilangan1+bilangan2) );
    }
}
