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
public class tg_TestAlatMusik {
    public static void main(String[] args) {
        tg_AlatMusikPetik sasando = new tg_AlatMusikPetik("Sasando");
        sasando.mainkan();
        sasando.setelNada(" B ");
        System.out.println("Nama alat Musik: "+sasando.ambilNama());
        
        tg_AlatMusikTiup harmonika = new tg_AlatMusikTiup("Harmonika");
        harmonika.mainkan();
        harmonika.setelNada(" E ");
        System.out.println("Nama alat Musik: "+harmonika.ambilNama());
        
        tg_AlatMusikPukul kendang = new tg_AlatMusikPukul ("Kendang");
        kendang.mainkan();
        kendang.setelNada(" A ");
        System.out.println("Nama alat Musik: "+kendang.ambilNama());
    }
}
