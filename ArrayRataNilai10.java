import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs;
        int jml, lulus = 0, tidaklulus = 0;
        double total = 0, totalTidakLulus = 0, rata2;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = sc.nextInt();
        nilaiMhs = new int[jml];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidaklulus++;
            }
        }
        if (lulus > 0) {
            rata2 = total / lulus;
            System.out.println("Rata rata nilai lulus = " + rata2);
        }
        if (tidaklulus > 0) {
            rata2 = totalTidakLulus / tidaklulus;
            System.out.println("Rata rata nilai tidak lulus = " + rata2);
        }

    }
}
