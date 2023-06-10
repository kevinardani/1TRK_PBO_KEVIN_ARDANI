/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author XiaoDan
 */
public class Tiket {
    private String nama_maskapai = "Garuda Indonesia";
    private String no_kursi = null;
    private String keberangkatan = null;
    private String tgl_terbang = null;

    public Tiket() {
    }

    public Tiket(String no_kursi, String keberangkatan, String tgl_terbang) {
        this.no_kursi = no_kursi;
        this.keberangkatan = keberangkatan;
        this.tgl_terbang = tgl_terbang;
    }

    public void setNamaMaskapai(String nama_maskapai) {
        this.nama_maskapai = nama_maskapai;
    }

    public void setNoKursi(String no_kursi) {
        this.no_kursi = no_kursi;
    }

    public void setKeberangkatan(String keberangkatan) {
        this.keberangkatan = keberangkatan;
    }

    public void setTglTerbang(String tgl_terbang) {
        this.tgl_terbang = tgl_terbang;
    }

    public String getNamaMaskapai() {
        return nama_maskapai;
    }

    public String getNoKursi() {
        return no_kursi;
    }

    public String getKeberangkatan() {
        return keberangkatan;
    }

    public String getTglTerbang() {
        return tgl_terbang;
    }

    public void printTiket() {
        System.out.println("Nama Maskapai: " + nama_maskapai);
        System.out.println("Nomor Kursi: " + no_kursi);
        System.out.println("Keberangkatan: " + keberangkatan);
        System.out.println("Tanggal Terbang: " + tgl_terbang);
    }
}
