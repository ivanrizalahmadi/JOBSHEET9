import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        double rataLulus = 0;
        double rataTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                rataLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                rataTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulusFinal = (jumlahLulus > 0) ? rataLulus / jumlahLulus : 0;
        double rataTidakLulusFinal = (jumlahTidakLulus > 0) ? rataTidakLulus / jumlahTidakLulus : 0;

        if (jumlahLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + rataLulusFinal);
        } else {
            System.out.println("Tidak ada nilai yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulusFinal);
        } else {
            System.out.println("Tidak ada nilai yang tidak lulus.");
        }
    }
}
