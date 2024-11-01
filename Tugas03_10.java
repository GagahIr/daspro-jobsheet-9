import java.util.Scanner;

public class Tugas03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean tersedia = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(cari)) {
                tersedia = true;
                break;
            }
        }

        if (tersedia) {
            System.out.println("Makanan '" + cari + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + cari + "' tidak ada di menu.");
        }

    }
}
