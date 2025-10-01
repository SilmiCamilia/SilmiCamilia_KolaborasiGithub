package jobsheet6;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner imup = new Scanner(System.in);
        System.out.println("--- Cetak Krs SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = imup.nextBoolean();
        
        if(uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
            
        }
        else{
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }
    }
}

