package Pertemuan12.Tugas;
public class Mahasiswa03 {
    String nim, nama, keperluan;

    public Mahasiswa03(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }
    public void tampilInformasi() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Keperluan: " + keperluan);
    }
}
