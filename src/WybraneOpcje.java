public class WybraneOpcje {
    void wykonajWybranaOpcje(int wybranaOpcja, Car[] parking1, Car[] parking2, Car[] parking3) {
        switch (wybranaOpcja) {
            case 1 -> {
                int suma = 0;
                for (Car car : parking1) {
                    if (car.wyswietlInformacjeOSamochodzie().equals("Yaris srebrny 2020")) {
                        suma = (suma + 1);
                    }
                }
                System.out.println("na parkingu fabryki Motomachi znajduje sie " + suma + " " + "Toyot Yaris z rocznika 2020");
            }
            case 2 -> {
                int liczbaSrebrnych = 0;
                int liczbaNiebieskich = 0;
                int liczbaCzarnych = 0;
                for (Car car : parking2) {
                    if (car.wyswietlKolorSamochodu().equals("srebrny")) {
                        liczbaSrebrnych = (liczbaSrebrnych + 1);
                    }
                    if (car.wyswietlKolorSamochodu().equals("niebieski")) {
                        liczbaNiebieskich = (liczbaNiebieskich + 1);
                    }
                    if (car.wyswietlKolorSamochodu().equals("czarny")) {
                        liczbaCzarnych = (liczbaCzarnych + 1);
                    }
                }


                if (liczbaSrebrnych > liczbaNiebieskich && liczbaSrebrnych > liczbaCzarnych) {
                    System.out.println("najwiecej jest samochodow w kolorze srebrnym i jest ich " + liczbaSrebrnych);
                }
                else if(liczbaNiebieskich > liczbaSrebrnych && liczbaNiebieskich > liczbaCzarnych) {
                    System.out.println("najwiecej jest samochodow w kolorze niebieskim i jest ich " + liczbaNiebieskich);
                }
                else if (liczbaCzarnych > liczbaSrebrnych && liczbaCzarnych > liczbaNiebieskich) {
                    System.out.println("najwiecej jest samochodow w kolorze czarnych i jest ich " + liczbaCzarnych);
                }

            }
            case 3 -> {
                System.out.println("Oto pierwsze 10 samochodów na parkingu fabryki Tahara:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(((i + 1) + "." + " " + parking3[i].wyswietlInformacjeOSamochodzie()));
                }
            }
            case 0 -> {
                System.out.println("Wychodze z programu");
            }
        }
    }
}
