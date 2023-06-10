/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author PC - 26 316
 */
public class CobaScanner {
    public static void main(String[] args){
        int bilangan1, bilangan2, hasil;
        String nama;
        
        //Scanner harus buat objek scanner
        Scanner objek= new Scanner(System.in);
        
        System.out.println("Masukkan Nama Anda: ");
        nama = objek.nextLine(); //Method nextline milik scanner untuk tipe data string
        
        System.out.println("Masukkan bilangan 1: ");
        bilangan1 = objek.nextInt();//method nextInt untuk tipe data Integer
        
        System.out.println("Masukkan bilangan 1: ");
        bilangan2 = objek.nextInt();//method nextInt untuk tipe data Integer
        
        hasil = bilangan1 + bilangan2;
        
        System.out.println("==========Hasil==========");
        System.out.println("Nama : " +nama);
        System.out.println("Penjumlahan" +bilangan1+" + "+bilangan2+" adalah" +hasil);
    }
}
