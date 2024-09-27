import java.util.Scanner;

public class jenisBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStok = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("jumlah barang yg masuk pada hari ke-" + i + ": ");
            int barangMasuk = scanner.nextInt();
            totalStok += barangMasuk;
        }
        System.out.println("Stok akhir barang setelah 5 hari: " + totalStok);
    }
}
