/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class mainhandhphone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan merk handhphone: ");
        String merk = input.nextLine();
        System.out.println("Masukkan tipe handhphone: ");
        String tipe = input.nextLine();
        System.out.println("Masukkan warna handhpone: ");
        String warna = input.nextLine();
        System.out.println("Masukkan Harga: ");
        double harga = input.nextDouble();
                
        handhphone h1 = new handhphone(merk,tipe,warna,harga);
        
        h1.setMerk("Xiaomi");
        h1.setTipe("Redmi");
        h1.setWarna("Pink");
        h1.setHarga(100000);
        
        System.out.println(h1.getMerk());
        System.out.println(h1.getTipe());
        System.out.println(h1.getWarna());
        System.out.println(h1.getHarga());
        
        System.out.println("Setelah harga diskon "+h1.HargaDiskon());
        h1.HargaDiskon();
    }
}
