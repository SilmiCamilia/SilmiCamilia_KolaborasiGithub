package jobsheet6;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner imup = new Scanner(System.in);
        System.out.println("--- Cetak Krs SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = imup.nextBoolean();
        String pesann = uktLunas 
                        ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
                        : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";

        System.out.println("\n=== Versi Ternary ===");
        System.out.println(pesann);

        imup.close();
    }}