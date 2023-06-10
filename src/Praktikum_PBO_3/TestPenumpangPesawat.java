/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

import java.util.Scanner;


public class TestPenumpangPesawat {
    public static void main(String[] args) {
        int n,i;
        String nama, jk, tujuan, kelas;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah penumpang yang akan diinputkan: ");
        n=Integer.parseInt(input.nextLine());
        //deklarasi
        PenumpangPesawat penumpang[]=new PenumpangPesawat[n];
        //Inisialisasi
        for(i=0;i<n;i++){
            penumpang[i]=new PenumpangPesawat();
        }
        //input data
        for(i=0;i<n;i++){
            System.out.println("Masukkan data penumpang "+(i+1));
            System.out.println("Masukkan nama penumpang: ");
            nama=input.nextLine();
            System.out.println("Masukkan jenis kelamin penumpang(L/P): ");
            jk=input.nextLine();
            System.out.println("Masukkan tujuan penumpang: ");
            tujuan=input.nextLine();
            System.out.println("Masukkan kelas penumpang: ");
            kelas=input.nextLine();
            
            System.out.println();
            
            penumpang[i].setNama(nama);
            penumpang[i].setJk(jk);
            penumpang[i].setTujuan(tujuan);
            penumpang[i].setKelas(kelas);
        }
        //show data
        System.out.println("Detail Penumpang yang telah diinputkan: ");
        System.out.println("Nama\tJK\tTujuan\tKelas");
        for(i=0;i<n;i++){
            System.out.println(penumpang[i].getNama()+"\t"+penumpang[i].getJk()
                +"\t"+penumpang[i].getTujuan()+"\t"+penumpang[i].getKelas());
        }        
    }
}
