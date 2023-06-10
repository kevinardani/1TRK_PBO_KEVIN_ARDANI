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
public class tg1_SmsNotifikasi implements tg1_Notifikasi{
    
    @Override
    public void sendMessage (String penerima, String isi) {
        System.out.println("Mengirim SMS ke: "+penerima);
        System.out.println("Isi SMS: "+isi);
        System.out.println("SMS terkirim.");
    }
}
