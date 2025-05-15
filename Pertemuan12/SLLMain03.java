/* KODE MODIFIKASI 

package Pertemuan12;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println();
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        sc.close();
    }
}
*/

/* KODE YANG  DIMODIFIKASI PADA PRAKTIKUM 2*/

package Pertemuan12;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        Mahasiswa03 mhs1 = new Mahasiswa03("12345", "Desy Dwi Puspita", "1A", 4.0);
        Mahasiswa03 mhs2 = new Mahasiswa03("12346", "Bimon", "3A", 3.8);
        Mahasiswa03 mhs3 = new Mahasiswa03("12347", "Kiara Gayatri", "1A", 3.9);
        Mahasiswa03 mhs4 = new Mahasiswa03("12348", "Arshaka Virendra", "2A", 3.7);
    
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Arshaka Virendra", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}

/* KODE YANG TIDAK DI MODIFIKASI
package Pertemuan12;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        Mahasiswa03 mhs1 = new Mahasiswa03("12345", "Desy Dwi Puspita", "1A", 4.0);
        Mahasiswa03 mhs2 = new Mahasiswa03("12346", "Bimon", "3A", 3.8);
        Mahasiswa03 mhs3 = new Mahasiswa03("12347", "Kiara Gayatri", "1A", 3.9);
        Mahasiswa03 mhs4 = new Mahasiswa03("12348", "Arshaka Virendra", "2A", 3.7);
    
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Arshaka Virendra", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
*/


