/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC - 26 316
 */
public class array_mainhandpone {
    public static void main(String[] args) {
         int jumlahHp = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Banyak Object Handphone : "));
        array_handpone[] hp = new array_handpone[jumlahHp];

        for (int k = 0; k < jumlahHp; k++) {
            hp[k] = new array_handpone();
        }
        for (int k = 0; k < jumlahHp; k++) {
            hp[k].inputData(k + 1);
        }

        for (int k = 0; k < jumlahHp; k++) {
            hp[k].outputdata();
            String TanyaDiskon = JOptionPane.showInputDialog("Apakah hp mendapatkan diskon?");
            if (TanyaDiskon.equalsIgnoreCase("ya")) {
                hp[k].keterangan();
            }
        }
    }
}