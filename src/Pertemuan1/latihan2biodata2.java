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
public class latihan2biodata2 {
    public static void main(String[] args) {
        int umur;
        String nama, kampus, nim, kelas;
        
        Scanner objek= new Scanner(System.in);
        
        System.out.print("Nama : ");
        nama = objek.nextLine(); 
        
        System.out.print("Kelas : ");
        kelas = objek.nextLine();
        
        System.out.print("NIM : ");
        nim = objek.nextLine();
        
        System.out.print("Kampus :");
        kampus = objek.nextLine();
        
        System.out.print("Umur :");
        umur = objek.nextInt();
        
    }
}
