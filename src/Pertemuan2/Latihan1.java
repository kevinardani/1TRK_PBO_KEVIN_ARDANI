/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author PC - 26 316
 */
public class Latihan1 {

    public static void main(String[] args) {

        int pass = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Password: "));
        {
            if(pass == 123456){
                System.out.println("Password anda benar");
            }else{
                System.out.println("Password anda salah");
            }
        }
    }
}
