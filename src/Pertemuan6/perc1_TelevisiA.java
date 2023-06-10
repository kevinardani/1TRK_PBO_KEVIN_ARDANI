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
public class perc1_TelevisiA implements perc1_Control {
    
        String[] channelTv = {"RCTI","SCTV","INDOSIAR","TRANS TV","TPI"};
        
        @Override
        public void pindahChannel(int channel){
            System.out.println("Pindah channel pada tb A ke : "+ channelTv[channel]);
        }
        
        @Override
         public void PerbesarVolume(int intensitas){
            System.out.println("Perbesar intensitas volume pada tv A sebanyak : "+ intensitas);
        }
        
        @Override
          public void PerkecilVolume(int intensitas){
            System.out.println("Perkecil intensitas volume pada tv ke A sebanyak : "+intensitas);
        }
        
}


