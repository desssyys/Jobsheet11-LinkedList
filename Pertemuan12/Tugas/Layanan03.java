package Pertemuan12.Tugas;

public class Layanan03{
    Node03 front, rear;
    int size = 0;
    int kapasitas;

    public Layanan03(int kapasitas) {
        this.front = this.rear = null;
        this.kapasitas = kapasitas;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= kapasitas;
    }

    public void enqueue(Mahasiswa03 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }

        Node03 newNode03 = new Node03(mhs);
        if (isEmpty()) {
            front = rear = newNode03;
        } else {
            rear.next = newNode03;
            rear = newNode03;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
        } else {
            System.out.print("Memanggil mahasiswa: ");
            front.data.tampilInformasi();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tampilDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian terdepan: ");
            front.data.tampilInformasi();

            if (front != rear) {
                System.out.print("Antrian paling belakang: ");
                rear.data.tampilInformasi();
            } else {
                System.out.println("Hanya ada satu orang dalam antrian.");
            }
        }
    }

    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar antrian mahasiswa:");
        Node03 current = front;
        int no = 1;
        while (current != null) {
            System.out.print(no + ". ");
            current.data.tampilInformasi();
            current = current.next;
            no++;
        }
    }
}

