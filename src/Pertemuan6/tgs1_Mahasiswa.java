///*
package Pertemuan6;

/**
 *
 * @author XiaoDan
 */
abstract class tgs1_Mahasiswa {
    String nama;
    double[] hasil;
    
    public tgs1_Mahasiswa(String nama, int MataKuliah){
        this.nama = nama;
        this.hasil = new double[MataKuliah];
    }
    
    public abstract double NilaiTertinggi();
    public abstract double NilaiRataRata();
}
