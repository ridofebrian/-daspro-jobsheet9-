import java.util.Scanner;

public class ArrayNilai20 {

    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " (LULUS)");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " (TIDAK LULUS)");
                tidakLulus++;
            }
        }
        System.out.println(" mahasiswa yang lulus       : " + lulus);
        System.out.println(" mahasiswa yang tidak lulus : " + tidakLulus);

        input.close();
    }
}
