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
public class perc1_TelevisiB  implements perc1_Control{
    
    String[] chanTv = {"TVRI","LA TV","TV 7","RCTI","SCTV"};
        
    @Override
        public void pindahChannel(int channel){
            System.out.println("Perintah channel pada tv B ke : "+ chanTv[channel]);
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
