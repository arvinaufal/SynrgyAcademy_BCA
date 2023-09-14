import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Nasi + Ayam", "Es Teh Manis"};
        int[] harga = {15000, 13000, 18000, 3000};
        int totalHarga = 0;

        System.out.println("============================");
        System.out.println("Selamat Datang di Binar Food");
        System.out.println("============================");
        System.out.println("");
        System.out.println("Silakan pilih makanan");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " | " + harga[i] + " IDR");
        }

        System.out.println("99. Pesan dan Bayar");
        System.out.println("0. Keluar Aplikasi");
        int choice;

        do {
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= menu.length) {
                totalHarga += harga[choice - 1];
                System.out.println("Anda memilih " + menu[choice - 1]);
            } else if (choice == 99) {
                System.out.println("============================");
                System.out.println("Konfirmasi dan Pembayaran");
                System.out.println("============================");
                System.out.println("");

                for (int i = 0; i < menu.length; i++) {
                    System.out.println(menu[i] + " | " + harga[i] + " IDR");
                }

                System.out.println("------------------------------------------------------+");
                System.out.println("Total           " + totalHarga + " IDR");
                System.out.println("");
                System.out.println("Pembayaran  :  BinarCash");
                System.out.println("");
                System.out.println("============================");
                System.out.println("Simpan struk ini sebagai bukti pembayaran ");
                System.out.println("============================");

                totalHarga = 0; // Reset total harga setelah pembayaran
            } else if (choice == 0) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println(""); // Membuat baris kosong untuk memisahkan antara pilihan
        } while (choice != 0);
    }
}