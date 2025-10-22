import java.util.Scanner;

public class ParkirDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        double total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break; // keluar dari perulangan
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) { // mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // motor
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
            }

            System.out.println("Total sementara: Rp " + total);
            System.out.println(); // biar tampilannya rapi

        } while (jenis != 0);

        System.out.println("Total Pembayaran Parkir Hari Ini = Rp " + total);
        sc.close();
    }
}
