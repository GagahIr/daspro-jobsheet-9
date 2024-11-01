import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPseanan;
        String[] namaPesanan;
        int[] harga;
        double totalBiaya = 0;

        System.out.print("Jumlah Pesanan : ");
        jmlPseanan = sc.nextInt();
        namaPesanan = new String[jmlPseanan];
        harga = new int[jmlPseanan];

        for (int i = 0; i < jmlPseanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1) + " ");
            namaPesanan[i] = sc.next();
            System.out.print("Masukkan harga pesanan ke-" + (i+1) + " ");
            harga[i] = sc.nextInt();

            totalBiaya += harga[i];
        }

        for (int i = 0; i < jmlPseanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + "  " + harga[i]);
        }
        System.out.println("Total Biaya: " + totalBiaya);
    }
}
