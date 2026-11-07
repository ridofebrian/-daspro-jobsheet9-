import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa masa kurang dari 0 mas.");
            scanner.close();
            return;
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
            total += nilaiMhs[i];

        }
        rata2 = (double) total / nilaiMhs.length;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        int JumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >= 70) {
                JumlahLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + JumlahLulus);

         if (rata2 >= 80) {
            System.out.println("Predikat kelas: Sangat Baik");
        } else if (rata2 >= 70) {
            System.out.println("Predikat kelas: Baik");
        } else {
            System.out.println("Predikat kelas: perlu pendampingan");
        }

        scanner.close();
    }
}