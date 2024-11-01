import java.util.Scanner;

public class Tugas1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs;
        int jmlNilaiMhs, tertinggi= 0, terendah = 100;
        double rata2, total = 0;

        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        jmlNilaiMhs = sc.nextInt();

        nilaiMhs = new int[jmlNilaiMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = total / nilaiMhs.length;
        System.out.println();
        System.out.println("Rata rata nilainya adalah " + rata2);
        
        for(int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println();
        System.out.println("Nilai Tertinggi adalah " + tertinggi);
        System.out.println();
        System.out.println("Nilai terendah adalah " + terendah);
        System.out.println();

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah " + nilaiMhs[i]);
        }
    }
}
