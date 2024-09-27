import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalGaji = 0;
        double gajiTertinggi = Double.MIN_VALUE;
        double gajiTerendah = Double.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("gaji karyawan ke-" + i + ": ");
            double gaji = input.nextDouble();

            // Menghitung total gaji
            totalGaji += gaji;

            // Mencari gaji tertinggi dan terendah
            if (gaji > gajiTertinggi) {
                gajiTertinggi = gaji;
            }
            if (gaji < gajiTerendah) {
                gajiTerendah = gaji;
            }
        }

        System.out.println("Total gaji yang harus dibayarkan: " + totalGaji);
        System.out.println("Gaji tertinggi: " + gajiTertinggi);
        System.out.println("Gaji terendah: " + gajiTerendah);
    }
}
