package Pertemuan12;

public class Mahasiswa03 {
        String nim, nama, kelas;
        double ipk;
    
        public Mahasiswa03() {}
    
        public Mahasiswa03(String nim, String nama, String kelas, double ipk) {
            this.nim = nim;
            this.nama = nama;
            this.kelas = kelas;
            this.ipk = ipk;
        }
    
        public void tampilInformasi() {
            System.out.printf("%-12s %-20s %-6s %.2f\n", nim, nama, kelas, ipk);
        }
    }      

