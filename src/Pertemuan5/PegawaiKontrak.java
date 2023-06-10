package pertemuan5;

public class PegawaiKontrak extends Pegawai {

    private static final double bonus_project = 0.002;

    public PegawaiKontrak(String nama, String jenisPegawai) {
        super(nama, jenisPegawai, 3000000);
    }

    public int hitungPenghasilan(int jamLembur, int nilaiProject) {
        int totalPenghasilan = super.hitungPenghasilan();
        totalPenghasilan += jamLembur * super.getGajiPokok();
        totalPenghasilan += (int) (nilaiProject * bonus_project);
        return totalPenghasilan;
    }
}