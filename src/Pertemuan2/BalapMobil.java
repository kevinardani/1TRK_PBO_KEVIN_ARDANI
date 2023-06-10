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
public class BalapMobil {

    public static void main(String[] args) {
        Mobil toyota = new Mobil();
        Mobil robicon = new Mobil();
        toyota.warna="red";
        toyota.tipe="Fortuner 4.0";
        toyota.harga=14000;
        toyota.speed=30;
        toyota.minyak=7;
        //toyota.isiMinyak();
//        toyota.maju();
//        toyota.maju();
//        toyota.cekMinyak();
        robicon.warna="pink";
        robicon.tipe="Robicon MK.4";
        robicon.harga=15000;
        robicon.minyak=10;
        robicon.cekMinyak();
        robicon.racing(70);
      
    }
}
