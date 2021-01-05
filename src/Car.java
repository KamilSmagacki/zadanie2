public class Car {
    private final String nazwaModelu;
    private final String kolor;
    private final int rocznik;

    Car(String nazwaModelu, String kolor, int rocznik) {
        this.nazwaModelu = nazwaModelu;
        this.kolor = kolor;
        this.rocznik = rocznik;
    }

    String wyswietlInformacjeOSamochodzie() {
        return nazwaModelu + " " + kolor + " " + rocznik;
    }

    String wyswietlKolorSamochodu() {
        return kolor;
    }
}
