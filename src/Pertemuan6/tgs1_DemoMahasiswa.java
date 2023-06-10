/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author XiaoDan
 */
public class tgs1_DemoMahasiswa {
     public static void main(String[] args) {
        tgs1_Mahasiswa mhs1 = new tgs1_Mahasiswa1("Mahasiswa 1");
        mhs1.hasil[0] = 50;
        mhs1.hasil[1] = 60;
        mhs1.hasil[2] = 85;

        tgs1_Mahasiswa mhs2 = new tgs1_Mahasiswa2("Mahasiswa 2");
        mhs2.hasil[0] = 70;
        mhs2.hasil[1] = 84;
        mhs2.hasil[2] = 88;
        mhs2.hasil[3] = 95;

        System.out.println("Nama Mahasiswa 1: " + mhs1.nama);
        System.out.println("Nilai Tertinggi Mahasiswa 1: " + mhs1.NilaiTertinggi());
        System.out.println("Nilai Rata-rata Mahasiswa 1: " + mhs1.NilaiRataRata());

        System.out.println("Nama Mahasiswa 2: " + mhs2.nama);
        System.out.println("Nilai Tertinggi Mahasiswa 2: " + mhs2.NilaiTertinggi());
        System.out.println("Nilai Rata-rata Mahasiswa 2: " + mhs2.NilaiRataRata());
    }
}
