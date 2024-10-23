package pert7praktikum;

import java.util.Scanner;

 public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"a001", "a002", "a003", "a004", "a005"};
        String[] namaBarang = {"Buku", "Lolipop", "Pulpen", "Beras", "Telur"};
        int[] hargaBarang = {3000, 4000, 5000, 10000, 2000};

        int jumlahItem;
        System.out.print("Masukkan Item Barang: ");
        jumlahItem = input.nextInt();

        String[] kodeInput = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeInput[i] = input.next();
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = input.nextInt();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    jumlahBayar[i] = jumlahBeli[i] * hargaBarang[j];
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("******************************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("====================================================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    System.out.printf("%d   %s         %s         %d        %d         %d\n",
                            (i + 1), kodeInput[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                    totalBayar += jumlahBayar[i];
                }
            }
        }

        System.out.println("====================================================================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("====================================================================");
    }
}
