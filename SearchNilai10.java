import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNilai;
        int key, jml;
        int hasil = 0;

        System.out.print("Masukkan banykanya nilai ynag akan diinput : ");
        jml = sc.nextInt();

        arrNilai = new int[jml];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang anda cari tidak ditemukan");
        }
    }
}
