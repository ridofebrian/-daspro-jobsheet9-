import java.util.Scanner;

public class Tugas120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NilaiLulus = 70;

        int jumlah;
        do {
            System.out.print("Masukkan banyaknya mahasiswa: ");
            jumlah = input.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
            }
        } while (jumlah <= 0);

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            do {
                System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = input.nextInt();
                if (nilai[i] < 0 || nilai[i] > 100) {
                    System.out.println("Nilai harus antara 0 - 100!");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);
            total += nilai[i];
        }
        double rataRata = (double) total / jumlah;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }
        System.out.printf("Rata-rata      :", rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] >= NilaiLulus) ? "LULUS" : "TIDAK LULUS";
            System.out.printf("Mahasiswa ke-%d: Nilai = %d, = %s%n", (i + 1), nilai[i], status);   
        }

        input.close();
    }
}