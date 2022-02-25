import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan;
        System.out.println("+-------------------------+");
        System.out.println("|Program Konversi Suhu Air|");
        System.out.println("+-------------------------+");
        System.out.println("Input Data");
        System.out.println("------------");

        // Bagian Input pertama menggunakan constructor
        Double inputAwal;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Suhu dalam Celcius : ");
            inputAwal = input.nextDouble();

            var perhitungan = new Konversi(inputAwal);

            // tampilan Opsi
            while (true) {
                perhitungan.menu();
                System.out.print("Pilih : ");
                pilihan = input.nextInt();
                System.out.println();
                switch (pilihan) {
                    case 1:
                        perhitungan.Kalkulasi(inputAwal);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Input Data");
                        System.out.println("----------");
                        System.out.print("Suhu dalam Celcius : ");
                        inputAwal = input.nextDouble();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opsi Tidak Ada, Mohon Masukkan Opsi dengan Benar");
                        break;
                }
            }
        }
    }
}
