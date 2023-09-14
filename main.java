package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Nasi + Ayam", "Es Teh Manis"};
        int[] harga = {15000, 13000, 18000, 3000};
        int[] jumlah = new int[menu.length];
        int totalHarga = 0;

        System.out.println("============================");
        System.out.println("Selamat Datang di Binar Food");
        System.out.println("============================");

        int choice;
        do {
            System.out.println("");
            System.out.println("Silakan pilih makanan");

            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " | " + harga[i] + " IDR");
            }

            System.out.println("99. Pesan dan Bayar");
            System.out.println("0. Keluar Aplikasi");

            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= menu.length) {
                System.out.print("Masukkan jumlah pesanan: ");
                int qty = scanner.nextInt();
                jumlah[choice - 1] += qty;
                System.out.println("Anda telah menambahkan " + qty + " " + menu[choice - 1]);
            } else if (choice == 99) {
                System.out.println("============================");
                System.out.println("Konfirmasi dan Pembayaran");
                System.out.println("============================");
                System.out.println("");

                for (int i = 0; i < menu.length; i++) {
                    if (jumlah[i] > 0) {
                        int subTotal = harga[i] * jumlah[i];
                        System.out.println(menu[i] + " | " + jumlah[i] + " | " + subTotal + " IDR");
                        totalHarga += subTotal;
                    }
                }

                System.out.println("------------------------------------------------------+");
                System.out.println("Total                                " + totalHarga + " IDR");
                System.out.println("");
                System.out.println("1. Konfirmasi dan Bayar");
                System.out.println("2. Kembali ke Menu Utama");
                System.out.println("0. Keluar aplikasi");
                System.out.println("");
                System.out.print("=> ");
                int pembayaranChoice = scanner.nextInt();

                if (pembayaranChoice == 1) {
                    System.out.println("============================");
                    System.out.println("BinarFud");
                    System.out.println("============================");
                    System.out.println("");
                    System.out.println("Terima kasih sudah memesan di BinarFud");
                    System.out.println("");

                    for (int i = 0; i < menu.length; i++) {
                        if (jumlah[i] > 0) {
                            int subTotal = harga[i] * jumlah[i];
                            System.out.println(menu[i] + " " + jumlah[i] + " " + subTotal + " IDR");
                        }
                    }

                    System.out.println("------------------------------------------------------+");
                    System.out.println("Total                                " + totalHarga + " IDR");
                    System.out.println("");
                    System.out.println("Pembayaran  :  BinarCash");
                    System.out.println("");
                    System.out.println("============================");
                    System.out.println("Simpan struk ini sebagai bukti pembayaran ");
                    System.out.println("============================");

                    totalHarga = 0;
                    jumlah = new int[menu.length]; // Reset jumlah pesanan
                }
            } else if (choice == 0) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (choice != 0);
    }
}