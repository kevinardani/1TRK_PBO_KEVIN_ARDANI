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
public class perc1_testInterface {
    public static void main(String[] args) {
        perc1_TelevisiA tvA = new perc1_TelevisiA();
        perc1_TelevisiB tvB = new perc1_TelevisiB();
        perc1_RemoteControl rc = new perc1_RemoteControl();
        
        rc.kirimPerintahKeTV(perc1_RemoteControl.PINDAH_CHANNEL, tvA, 2);
        rc.kirimPerintahKeTV(perc1_RemoteControl.PERBESAR_VOLUME, tvA, 5);
        
        
        rc.kirimPerintahKeTV(perc1_RemoteControl.PINDAH_CHANNEL, tvB, 1);
        
        rc.kirimPerintahKeTV(perc1_RemoteControl.PERKECIL_VOLUME, tvB, 2);
    }
}
