/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.util.Random;

/**
 *
 * @author XiaoDan
 */
public class perc2_DemoHewan {

    public static void main(String[] args) {
        perc2_Hewan[] peliharaanku = {new perc2_Burung("Kakak Tua"), new perc2_Kambing("Etawa"),
            new perc2_Anjing("Kintaman"), new perc2_Kucing("Anggora")
        };
        perc2_Hewan kesayangan;
        Random pilihan = new Random();//memilih acak
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        //mengacak bilangan dari 0 sampai length-1 atau i-1
        System.out.println("Binatang kesayangan anda : " + kesayangan);
        System.out.print("Suaranya : ");
        kesayangan.suara();
    }
}
