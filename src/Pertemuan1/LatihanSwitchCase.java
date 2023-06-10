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
public class LatihanSwitchCase {

    public static void main(String[] args) {
        String ulang;
        do {
            int bil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan"));

            switch (bil) {
                case 10:
                    System.out.println("bilangan nominal 10");
                    break;
                case 5:
                    System.out.println("bilangan nominal adalah 5");
                    break;
                case 2:
                    System.out.println("Bilangan 2 adalah genap");
                    break;
                default:
                    System.out.println("Bilangan tidak terinformasikan");
                    break;
            }
            ulang = JOptionPane.showInputDialog("Ingin ulang lagi?? ");
        } while (ulang.equalsIgnoreCase("ya"));
    }
}
