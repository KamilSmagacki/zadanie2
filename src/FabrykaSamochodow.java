import java.util.Random;

public class FabrykaSamochodow {
    Random rd = new Random();

     String wylosujModel() {
        int wylosowanaLiczba = rd.nextInt(3);

        switch (wylosowanaLiczba) {
            case 0 -> {
                return "Yaris";
            }
            case 1 -> {
                return "Corolla";
            }
            case 2 -> {
                return "Aygo";
            }
        }
        return null;

    }

     String wylosujKolor() {
        int wylosowanaLiczba = rd.nextInt(3);

        switch (wylosowanaLiczba) {
            case 0 -> {
                return "srebrny";
            }
            case 1 -> {
                return "niebieski";
            }
            case 2 -> {
                return "czarny";
            }
        }
        return null;
    }

     int wylosujRocznik() {
        int wylosowanaLiczba = rd.nextInt(3);

        switch (wylosowanaLiczba) {
            case 0 -> {
                return 2018;
            }
            case 1 -> {
                return 2019;
            }
            case 2 -> {
                return 2020;
            }
        }
        return 0;
    }

    static Car wyprodukujSamochod(String nazwaModelu, String kolor, int rocznik) {
        Car newCar = new Car(nazwaModelu, kolor, rocznik);
        return newCar;
    }
}