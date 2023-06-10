/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class TestPenumpangPesawat {
       public static void main(String[] args) {
           String nama, jk, tujuan;
        int umur;

        int n = 2;
        int i;
        Scanner sc = new Scanner(System.in);
        PenumpangPesawat pn[] = new PenumpangPesawat[n];

        for (i = 0; i < n; i++) {
            pn[i] = new PenumpangPesawat();
        }
        for (i = 0; i < n; i++) {
            System.out.println("inputkan data penumpang " + (i + 1) + ":");
            pn[i].keterangan();
            System.out.println();
        }
        System.out.println("Detail inputan: ");
        System.out.println("Nama\tjk\tTujuan\tUmur\tHarga\tKet");
        for (i = 0; i < n; i++) {//looping
            pn[i].detail();
        }
    }
}

