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
public class tg1_TestNotifikasi {
    public static void main(String[] args) {
        tg1_EmailNotifikasi Em = new tg1_EmailNotifikasi();
        Em.sendMessage("kevin22trk@mahasiswa.pcr.ac.id",
                "Sorry, there is no give up word in my dictionary");
        
        tg1_SmsNotifikasi Sn = new tg1_SmsNotifikasi();
        Sn.sendMessage("085362492547", "PBO is easy peasy");
    }
}
