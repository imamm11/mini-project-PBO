import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Keterangan: Lulus");
        } else {
            System.out.println("Keterangan: Tidak Lulus");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        Mahasiswa[] data = {mhs1, mhs2, mhs3};

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            data[i].nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            data[i].nim = input.nextLine();

            System.out.print("Masukkan nilai: ");
            data[i].nilai = Double.parseDouble(input.nextLine());
        }

        System.out.println("\n=== HASIL DATA MAHASISWA ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            data[i].tampilkanData();
            data[i].cekKelulusan();
        }

        input.close();
    }
}