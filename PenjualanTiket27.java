import java.util.Scanner;

public class PenjualanTiket27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargatiket = 50000, jumlahTiket, totalTiket = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Program selesai");
                break;
            } else if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jumlahTiket * 50000;
            double hargaAkhir = totalHarga - (totalHarga * diskon);

            System.out.println("Total bayar: Rp " + hargaAkhir);
            
            totalTiket += jumlahTiket;
            totalPendapatan += hargaAkhir;

            System.out.println("=== REKAP PENJUALAN HARI INI ===");
            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total pendapatan: Rp " + totalPendapatan);
        sc.close();
        }

    }
}
