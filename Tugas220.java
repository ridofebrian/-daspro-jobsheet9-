import java.util.Scanner;

public class Tugas220 {
    static int cariMenu(String[] menu, String nama) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KAFE RIDO AAA=====");
        System.out.println("Menu tersedia:");
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.print("\nJumlah item yang dipesan: ");
        int jumlah = Integer.parseInt(input.nextLine());
        String[] pesanan = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            int posisi;
            do {
                System.out.print("Item ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                posisi = cariMenu(menu, nama);
                if (posisi == -1) {
                    System.out.println("Menu tidak tersedia, coba lagi.");
                }
            } while (posisi == -1);
            pesanan[i] = menu[posisi];
        }
        int total = 0;
        System.out.println("\n===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            int h = harga[cariMenu(menu, pesanan[i])];
            total += h;
            System.out.printf("%d. %-16s Rp %d%n", (i + 1), pesanan[i], h);
        }
        System.out.println("--------------------------");
        System.out.println("Total biaya: Rp " + total);

        input.close();
    }
}