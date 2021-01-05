import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WybraneOpcje wo = new WybraneOpcje();
        Scanner sc = new Scanner(System.in);
        FabrykaSamochodow fs = new FabrykaSamochodow();
        int wybranaOpcja = -1;
        Car[] Motomachi = new Car[5000];
        Car[] Tsutsumi = new Car[4500];
        Car[] Tahara = new Car[1700];

        for (int i = 0; i < Motomachi.length; i++) {
            Motomachi[i] = FabrykaSamochodow.wyprodukujSamochod(fs.wylosujModel(), fs.wylosujKolor(), fs.wylosujRocznik());
        }
        for (int i = 0; i < Tsutsumi.length; i++) {
            Tsutsumi[i] = FabrykaSamochodow.wyprodukujSamochod(fs.wylosujModel(), fs.wylosujKolor(), fs.wylosujRocznik());
        }
        for (int i = 0; i < Tahara.length; i++) {
            Tahara[i] = FabrykaSamochodow.wyprodukujSamochod(fs.wylosujModel(), fs.wylosujKolor(), fs.wylosujRocznik());
        }
        try {
            do {
                Menu.wyswietlMenu();
                wybranaOpcja = sc.nextInt();
                wo.wykonajWybranaOpcje(wybranaOpcja, Motomachi, Tsutsumi, Tahara);
            } while (wybranaOpcja != 0);
        }catch (InputMismatchException e) {
            System.out.println("Mozna uzywac tylko cyfr!");
        }
        sc.close();
    }
}
