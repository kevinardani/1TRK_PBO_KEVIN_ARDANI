/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class PenumpangPesawat {
    private String nama, jk, tujuan, ket;
    private int umur;
    private double harga;
    PenumpangPesawat() {
        nama = "";
        jk = "";
        tujuan = "";
        umur = 0;
    }

    public PenumpangPesawat(String nama, String jk, String tujuan, int umur) {
        this.nama = nama;
        this.jk = jk;
        this.tujuan = tujuan;
        this.umur = umur;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public void setjk(String jk) {
        this.jk = jk;
    }

    public String getjk() {
        return jk;
    }

    public void settujuan() {
        this.tujuan = tujuan;
    }

    public String gettujuan() {
        return tujuan;
    }

    public void setumur() {
        this.umur = umur;
    }

    public int getumur() {
        return umur;
    }

    void keterangan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputkan nama anda: ");
        nama = sc.nextLine();
        System.out.println("inputkan jenis kelamin anda: ");
        jk = sc.nextLine();
        System.out.println("inputkan tujuan anda: ");
        tujuan = sc.nextLine();
        System.out.println("inputkan umur anda: ");
        umur = sc.nextInt();
        System.out.println("inputkan harga penumpang: ");
        harga = sc.nextDouble();
    }

    public void detail() {

        if (umur < 3) {
            ket = "penumpang tidak dikenakan biaya";
            harga = 0;
            
        } else if ((umur > 3) && (umur < 5)) {
            ket="penumpang dikenakan biaya sebesar 70% dari total biaya";
            harga -= (harga*0.7);
        } else if (umur > 5) {
            ket ="Biaya full";
            
        }
        System.out.println(nama + "\t" + jk + "\t" + tujuan + "\t" + umur+"\t"+harga+"\t"+ket);

    }
}