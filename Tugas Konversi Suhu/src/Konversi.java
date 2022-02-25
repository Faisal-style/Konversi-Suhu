public class Konversi {
    Konversi(double input) {
        ConvertR(input);
        ConvertK(input);
        ConvertF(input);
    }

    double ConvertR(double celcius) {
        double hasil;
        hasil = (4 * celcius) / 5;
        return hasil;
    }

    double ConvertK(double celcius) {
        double hasil;
        hasil = celcius + 273.15;
        return hasil;
    }

    double ConvertF(double celcius) {
        double hasil;
        hasil = (9 * celcius) / 5 + 32;
        return hasil;
    }

    void Kalkulasi(double input) {
        System.out.println("Suhu dalam Celcius     : " + input + "º" + "C");
        System.out.println("Suhu dalam Farenheit   : " + ConvertF(input) + "º" + "F");
        System.out.println("Suhu dalam Reamur      : " + ConvertR(input) + "º" + "R");
        System.out.println("Suhu dalam Kelvin      : " + ConvertK(input) + "K");
        System.out.println();
        System.out.println();
        if (input >= 100) {
            System.out.println("Kondisi Air Mendidih");
        } else if (input <= 0) {
            System.out.println("Kondisi Air Beku");
        } else {
            System.out.println("Kondisi Air Normal");
        }
    }

    void menu() {
        System.out.println();
        System.out.println("Opsi");
        System.out.println("----");
        System.out.println("1. Lihat Data Konversi");
        System.out.println("2. Edit Data Konversi");
        System.out.println("3. Exit");
    }
}
