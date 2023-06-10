package pertemuan5;

public class Pegawai {
    private String nama;
    private String jenisPegawai;
    private int gajiPokok;

    public Pegawai(String nama, String jenisPegawai, int gajiPokok) {
        this.nama = nama;
        this.jenisPegawai = jenisPegawai;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisPegawai() {
        return jenisPegawai;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int hitungPenghasilan() {
        return gajiPokok;
    }
}
