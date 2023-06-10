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
class tgs1_Mahasiswa2 extends tgs1_Mahasiswa {
    public tgs1_Mahasiswa2(String nama) {
        super(nama, 4);
    }

    public double NilaiTertinggi() {
        double tertinggi = hasil[0];
        for (int i = 1; i < hasil.length; i++) {
            if (hasil[i] > tertinggi) {
                tertinggi = hasil[i];
            }
        }
        return tertinggi;
    }

    public double NilaiRataRata() {
        double total = 0;
        for (int i = 0; i < hasil.length; i++) {
            total += hasil[i];
        }
        return total / hasil.length;
    }
}
