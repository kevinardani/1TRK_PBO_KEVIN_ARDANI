/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author PC - 26 316
 */
public class Mobil {

    String warna;
    String tipe;
    int harga;
    int speed;
    int minyak = 10;

    void maju() {
        System.out.println(tipe + "Mobil maju");
        minyak--;
    }

    void mundur() {
        System.out.println(tipe + "Mundur");
        minyak--;
    }

    void isiMinyak() {
        minyak++;
        System.out.println(tipe + "Minyak saat ini:" + minyak);
    }

    void cekMinyak() {
        System.out.println(tipe + "Minyak saat ini:" + minyak);
    }

    int racing(int s) {
        if (s > 0 && s < 60) {
            minyak -= 1;
        } else if (s > 60 && s < 100) {
            minyak -= 5;
        } else if (s > 100) {
            minyak -= 10;
        } else {
            minyak = minyak;
        }
        return minyak;
    }
}
