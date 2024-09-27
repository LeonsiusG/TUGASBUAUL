import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tiketTerjual = new int[7];
        int totalTiket = 0;

        // input jumlah tiket yang terjual selama 7 hari
        for (int i = 0; i < 7; i++) {
            System.out.print("Masukkan jumlah tiket yang terjual pada hari ke-" + (i + 1) + ": ");
            tiketTerjual[i] = scanner.nextInt();
            totalTiket += tiketTerjual[i];
        }

        // rata rata jumlah yg terjual selama 1 pekan
        double rataRataTiket = (double) totalTiket / 7;

        // Menampilkan hasil
        System.out.println("Total tiket yang terjual selama satu minggu: " + totalTiket);
        System.out.println("Rata rata tiket yang terjual per hari: " + rataRataTiket);
    }

}
