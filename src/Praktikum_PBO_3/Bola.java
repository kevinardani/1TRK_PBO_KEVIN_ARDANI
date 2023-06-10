/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

public class Bola {
    private double jari;
    private String jenis;

    public Bola() {
        jari = 4;
        jenis = "Bola pimpong";
    }

    public Bola(double jari, String jenis) {
        this.jari = jari;
        this.jenis = jenis;
    }

    public double hitungVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari, 3);
        return volume;
    }

    public void printBola() {
        System.out.println("jari - jari : " + jari);
        System.out.println("jenis bola : " + jenis);
        System.out.println("volume bola: " + hitungVolume() + "\n");
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}