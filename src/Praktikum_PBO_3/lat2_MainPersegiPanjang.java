/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

import java.util.Scanner;

public class lat2_MainPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        lat2_PersegiPanjang[] persegiPanjang = new lat2_PersegiPanjang[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan panjang data ke-" + (i+1) + ": ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar data ke-" + (i+1) + ": ");
            double lebar = input.nextDouble();

            persegiPanjang[i] = new lat2_PersegiPanjang(panjang, lebar);
        }

        System.out.println("Data PersegiPanjang:");
        System.out.println("-----------------------------");

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i+1) + ":");
            System.out.println(persegiPanjang[i].toString());
        }
    }
}
