package pertemuan5;

public class PegawaiTetap extends Pegawai {

    private static final int tunjangan = 500000;
    private static final int lembur_per_jam = 50000;

    public PegawaiTetap(String nama, String jenisPegawai) {
        super(nama, jenisPegawai, 4000000);
    }

    public int hitungPenghasilan(int jamLembur) {
        int totalPenghasilan = super.hitungPenghasilan() + tunjangan;
        totalPenghasilan += jamLembur * lembur_per_jam;
        return totalPenghasilan;
    }
}

