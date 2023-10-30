import java.util.Scanner;

public class Tugas9 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlahElemen = input13.nextInt();

        int[] array = new int[jumlahElemen];

        // Input nilai untuk setiap elemen array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            array[i] = input13.nextInt();
        }

        // Menghitung nilai tertinggi dan terendah
        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        double total = array[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }

        // Menghitung nilai rata-rata
        double rata = total / jumlahElemen;

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rata);
    }
}
