package jobsheet6;

import java.util.Scanner;

public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner mimi = new Scanner (System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = mimi.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
    
}
