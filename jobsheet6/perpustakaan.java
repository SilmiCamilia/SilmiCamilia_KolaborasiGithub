package jobsheet6;
    import java.util.Scanner;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner bubub = new Scanner(System.in);

        System.out.print("Apakah Anda membawa kartu mahasiswa? (true/false): ");
        boolean kartu = bubub.nextBoolean();
        System.out.print("Apakah Anda sudah melakukan registrasi online? (true/false): ");
        boolean registrasi = bubub.nextBoolean();
        if (kartu || registrasi) {
            System.out.println("Izin masuk perpustakaan diberikan.");
        } else {
            System.out.println("Maaf, izin masuk ditolak. Harap bawa kartu atau registrasi online.");
        }

    }
}


