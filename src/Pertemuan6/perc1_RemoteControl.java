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
public class perc1_RemoteControl {
    public static final int PINDAH_CHANNEL = 1;
    public static final int PERBESAR_VOLUME = 2;
    public static final int PERKECIL_VOLUME = 3;
    
    public void kirimPerintahKeTV(int aksi, perc1_Control tv,int tombol){
        switch (aksi){
            case PINDAH_CHANNEL:
                tv.pindahChannel(tombol);break;
            case PERBESAR_VOLUME:
                tv.PerbesarVolume(tombol);break;
            case PERKECIL_VOLUME:
                tv.PerkecilVolume(tombol);break;
        }
    }
}
