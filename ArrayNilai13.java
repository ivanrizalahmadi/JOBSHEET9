import java.util.Scanner;

/**
 * ArrayNilai13
 */
public class ArrayNilai13 {

    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus!");
            }
        }

    }
}
