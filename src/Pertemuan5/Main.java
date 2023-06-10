package pertemuan5;

public class Main {

    public static void main(String[] args) {
        PegawaiTetap pt = new PegawaiTetap("Kevin", "Manager");
        System.out.println("Nama Pegawai : " + pt.getNama());
        System.out.println("Jenis Pegawai : " + pt.getJenisPegawai());
        System.out.println("Total Penghasilan : " + pt.hitungPenghasilan(10) + "\n");

        PegawaiKontrak k = new PegawaiKontrak("Ardani", "Programmer");
        System.out.println("Nama Pegawai : " + k.getNama());
        System.out.println("Jenis Pegawai : " + k.getJenisPegawai());
        System.out.println("Total Penghasilan : " + k.hitungPenghasilan(20, 100000000));
    }
}
