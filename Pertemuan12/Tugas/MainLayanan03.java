package Pertemuan12.Tugas;

import java.util.Scanner;

public class MainLayanan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Layanan03 antrian = new Layanan03(10); 

        int pilihan;
        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan & Paling Belakang");
            System.out.println("6. Tampilkan Seluruh Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); 
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    Mahasiswa03 mhs = new Mahasiswa03(nim, nama, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 5:
                    antrian.tampilDepanBelakang();
                    break;
                case 6:
                    antrian.printAntrian();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
