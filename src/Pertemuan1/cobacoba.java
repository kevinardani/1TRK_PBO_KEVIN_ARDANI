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
public class cobacoba {

    public static void main(String[] args) {
        int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));
        
        //8%2 = 0 --> 0==0 
        if ((angka % 2 == 0) && (angka < 10)){
            System.out.println("Angka adalah" + angka + " Bilangan Genap");
            System.out.println("Angka Merupakan Bilangan yang kecil dari 10");
            
        }else if(angka%2==1) {
            System.out.println("Angka adalah " + angka + " Bilangan Ganjil");
        }
        else {
            System.out.println("Angka adalah " + angka + " Bilangan Ganjil");
        }
    }
}
