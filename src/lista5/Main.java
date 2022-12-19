package lista5;

import lista5.komparatory.ComparatorKursyECTSy;
import lista5.komparatory.ComparatorNazwisko;
import lista5.komparatory.ComparatorNazwiskoImie;
import lista5.komparatory.ComparatorNazwiskoWiek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Uczelnia pwr=new Uczelnia();
        Scanner scanner = new Scanner(System.in);
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Osoby"))) {
            pwr.setOsoby((ArrayList<Osoba>) ois.readObject());
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kursy"))) {
            pwr.setKursy((ArrayList<Kurs>) ois.readObject());
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }
        pwr.wyswietlDaneWszystkichStudentow();
        pwr.wyswietlDaneWszystkichPracownikow();
        pwr.wyswietlDaneWszystkichKursow();
        boolean dataLoop=true;
        int inputSwitch;
        while(dataLoop){
            System.out.println("Witaj w systemie zarządzania uczelnią. Wybierz opcję:");
            System.out.println("1. Dodawanie nowych informacji");
            System.out.println("2. Przydzielanie studentowi kursu");
            System.out.println("3. Wyszukiwanie");
            System.out.println("4. Wyświetlanie danych");
            System.out.println("5. Sortowanie");
            System.out.println("6. Usuwanie danych");
            System.out.println("7. Przydziel/Odlacz prowadzacego od Kursu");
            System.out.println("8. Zakończ działanie programu");
            inputSwitch=scanner.nextInt();
            switch (inputSwitch){
                case 1:
                    System.out.println("1.Dodaj pracownika");
                    System.out.println("2.Dodaj kurs");
                    System.out.println("3.Dodaj studenta");
                    inputSwitch=scanner.nextInt();
                    switch (inputSwitch) {
                        case 1 -> {
                            System.out.println("Podaj imię pracownika:");
                            String imie = scanner.next();
                            System.out.println("Podaj nazwisko pracownika:");
                            String nazwisko = scanner.next();
                            System.out.println("Podaj PESEL pracownika:");
                            String pesel = scanner.next();
                            System.out.println("Podaj wiek pracownika:");
                            int wiek = scanner.nextInt();
                            System.out.println("Podaj płeć pracownika:");
                            String plec = scanner.next();
                            System.out.println("Podaj stanowisko pracownika:");
                            String stanowisko = scanner.next();
                            System.out.println("Podaj staż pracy pracownika:");
                            int stazPracy = scanner.nextInt();
                            System.out.println("Podaj pensję pracownika:");
                            int pensja = scanner.nextInt();
                            System.out.println("Podaj liczbę publikacji pracownika:");
                            int liczbaPublikacji = scanner.nextInt();
                            System.out.println("Podaj liczbę nadgodzin pracownika:");
                            int liczbaNadgodzin = scanner.nextInt();
                            pwr.dodajPracownika(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja, liczbaPublikacji, liczbaNadgodzin);
                        }
                        case 2 -> {
                            System.out.println("Podaj nazwę kursu:");
                            scanner.nextLine();
                            String nazwaKursu = scanner.nextLine();
                            System.out.println("Podaj prowadzącego kurs (za pomocą PESELU/nazwiska):");
                            String prowadzacyKurs = scanner.next();
                            System.out.println("Podaj liczbę ECTSow:");
                            int liczbaECTS = scanner.nextInt();
                            pwr.dodajKurs(nazwaKursu, ((pracownikDydaktycznoBadawczy) pwr.wyszukajPracownikow(prowadzacyKurs).get(0)), liczbaECTS);
                        }
                        case 3 -> {
                            System.out.println("Podaj imię studenta:");
                            String imieStudenta = scanner.next();
                            System.out.println("Podaj nazwisko studenta:");
                            String nazwiskoStudenta = scanner.next();
                            System.out.println("Podaj PESEL studenta:");
                            String peselStudenta = scanner.next();
                            System.out.println("Podaj wiek studenta:");
                            int wiekStudenta = scanner.nextInt();
                            System.out.println("Podaj płeć studenta:");
                            String plecStudenta = scanner.next();
                            System.out.println("Podaj numer albumu studenta:");
                            int numerAlbumu = scanner.nextInt();
                            System.out.println("Podaj rok studiów studenta:");
                            int rokStudiow = scanner.nextInt();
                            System.out.println("Podaj listę kursów studenta:");
                            ArrayList<Kurs> listaKursowStudenta = new ArrayList<>();
                            scanner.nextLine();
                            String listaKursowStudentaString = scanner.nextLine();
                            String[] listaKursowStudentaStringArray = listaKursowStudentaString.split(",");
                            for (String s : listaKursowStudentaStringArray) {
                                listaKursowStudenta.add((Kurs) pwr.wyszukajKursy(s).get(0));
                            }
                            System.out.println("Czy student jest na Erasmusie? (true/false)");
                            Boolean czyErasmus = scanner.nextBoolean();
                            System.out.println("Podaj stopień studiów studenta (1/2):");
                            int stopienStudiow = scanner.nextInt();
                            boolean czy1stopien = false;
                            boolean czy2stopien = false;
                            if (stopienStudiow == 1) {
                                czy1stopien = true;
                            } else if (stopienStudiow == 2) {
                                czy2stopien = true;
                            }
                            System.out.println("Czy student studiuje stacjonarnie? (true/false)");
                            boolean czyStacjonarnie = scanner.nextBoolean();
                            pwr.dodajStudenta(imieStudenta, nazwiskoStudenta, peselStudenta, wiekStudenta, plecStudenta, numerAlbumu, rokStudiow, listaKursowStudenta, czyErasmus, czy1stopien, czy2stopien, czyStacjonarnie, !czyStacjonarnie);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Podaj PESEL studenta, którego chcesz przypisać do kursu");
                    String peselStudentak=scanner.next();
                    System.out.println("Podaj nazwę kursu:");
                    scanner.nextLine();
                    String nazwaKursuK=scanner.nextLine();
                    pwr.przydzielStudentowiKurs(pwr.wyszukajStudentow(peselStudentak).get(0),pwr.wyszukajKursy(nazwaKursuK).get(0));
                    break;
                case 3:
                    System.out.println("1. Wyszukaj pracownika");
                    System.out.println("2. Wyszukaj kurs");
                    System.out.println("3. Wyszukaj studenta");
                    int wyborWyszukiwania=scanner.nextInt();
                    switch (wyborWyszukiwania) {
                        case 1 -> {
                            System.out.println("Podaj dane pracownika, którego chcesz wyszukać");
                            String danePracownika = scanner.next();
                            pwr.wyswietlDaneWszystkichPracownikow(pwr.wyszukajPracownikow(danePracownika));
                        }
                        case 2 -> {
                            System.out.println("Podaj dane kursu, którego chcesz wyszukać");
                            scanner.nextLine();
                            String daneKursu = scanner.nextLine();
                            pwr.wyswietlDaneWszystkichKursow(pwr.wyszukajKursy(daneKursu));
                        }
                        case 3 -> {
                            System.out.println("Podaj dane studenta, którego chcesz wyszukać");
                            String daneStudenta = scanner.next();
                            pwr.wyswietlDaneWszystkichStudentow(pwr.wyszukajStudentow(daneStudenta));
                        }
                    }
                    break;
                case 4:
                    System.out.println("1. Wyświetl dane wszystkich Pracowników");
                    System.out.println("2. Wyświetl dane wszystkich Kursów");
                    System.out.println("3. Wyświetl dane wszystkich Studentów");
                    System.out.println("4. Wyświetl dane wszystkich Studentów danego Kursu");
                    System.out.println("5. Wyświetl dane wszystkich Studentów danego roku");
                    inputSwitch=scanner.nextInt();
                    switch (inputSwitch) {
                        case 1 -> pwr.wyswietlDaneWszystkichPracownikow();
                        case 2 -> pwr.wyswietlDaneWszystkichKursow();
                        case 3 -> pwr.wyswietlDaneWszystkichStudentow();
                        case 4 -> {
                            System.out.println("Podaj dane kursu, dla którego chcesz wypisać studentów w nim uczestniczących:");
                            scanner.nextLine();
                            String daneKursuStudentow = scanner.nextLine();
                            pwr.wyswietlDaneWszystkichStudentow(pwr.wyszukajStudentow(pwr.wyszukajKursy(daneKursuStudentow).get(0).getNazwaKursu()));
                        }
                        case 5 -> {
                            System.out.println("Podaj rok studiów:");
                            int rokStudiowStudentow = scanner.nextInt();
                            pwr.wyswietlDaneWszystkichStudentow(pwr.wyszukajStudentow(String.valueOf(rokStudiowStudentow)));
                        }
                    }
                    break;
                case 5:
                    System.out.println("1. Sortuj osoby po nazwisku");
                    System.out.println("2. Sortuj osoby po nazwisku, następnie po imieniu");
                    System.out.println("3. Sortuj osoby po nazwisku, następnie po wieku");
                    System.out.println("4. Sortuj kursy po ECTSach, następnie po nazwiskach prowadzących");
                    int inputSort=scanner.nextInt();
                    boolean x=false;
                    Comparator<Osoba> comparatorO = null;
                    Comparator<Kurs> comparatorK = null;
                    switch (inputSort) {
                        case 1 -> {
                            comparatorO = new ComparatorNazwisko();
                            x=true;
                        }
                        case 2 -> {
                            comparatorO = new ComparatorNazwiskoImie();
                            x=true;
                        }
                        case 3 -> {
                            comparatorO = new ComparatorNazwiskoWiek();
                            x=true;
                        }
                        case 4 -> comparatorK = new ComparatorKursyECTSy();
                    }
                    if(x) {
                        Collections.sort(pwr.getOsoby(),comparatorO);
                    } else {
                        Collections.sort(pwr.getKursy(),comparatorK);
                    }
                    x=false;
                    break;
                case 6:
                    System.out.println("1. Usuń pracownika");
                    System.out.println("2. Usuń kurs");
                    System.out.println("3. Usuń studenta");
                    int inputUsun=scanner.nextInt();
                    switch (inputUsun) {
                        case 1 -> {
                            System.out.println("Podaj dane pracownika/ów, którego/ych chcesz usunąć");
                            String danePracownika = scanner.next();
                            pwr.usunPracownikow(pwr.wyszukajPracownikow(danePracownika));
                        }
                        case 2 -> {
                            System.out.println("Podaj dane kursu/ów, którego/ych chcesz usunąć");
                            scanner.nextLine();
                            String daneKursu = scanner.nextLine();
                            pwr.usunKursy(pwr.wyszukajKursy(daneKursu));
                        }
                        case 3 -> {
                            System.out.println("Podaj dane studenta/ów, którego/ych chcesz usunąć");
                            String daneStudenta = scanner.next();
                            pwr.usunStudentow(pwr.wyszukajStudentow(daneStudenta));
                        }
                    }
                    break;
                case 7:
                    System.out.println("1. Przydziel Prowadzacemu kurs");
                    System.out.println("2. Odlacz Prowadzacego od kursu");
                    int inputPrzydziel=scanner.nextInt();
                    switch (inputPrzydziel){
                        case 1 -> {
                            String daneProwadzacego;
                            String daneKursu;
                            System.out.println("Podaj dane prowadzącego, któremu chcesz przydzielić kurs");
                            scanner.nextLine();
                            daneProwadzacego =scanner.nextLine();
                            System.out.println("Podaj dane kursu");
                            daneKursu= scanner.nextLine();
                            pwr.przydzielProwadzacego(pwr.wyszukajKursy(daneKursu).get(0), (pracownikDydaktycznoBadawczy) pwr.wyszukajPracownikow(daneProwadzacego).get(0));
                        }
                        case 2 -> {
                            String daneProwadzacego;
                            String daneKursu;
                            System.out.println("Podaj dane prowadzącego, któremu chcesz przydzielić kurs");
                            daneProwadzacego =scanner.nextLine();
                            System.out.println("Podaj dane kursu");
                            daneKursu= scanner.nextLine();
                            pwr.odlaczProwadzacego(pwr.wyszukajKursy(daneKursu).get(0));
                        }
                    }
                    break;
                case 8:
                    dataLoop=false;
                    break;
            }
            if(!dataLoop){
                break;
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Osoby"));
            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("Kursy"));
            oos.writeObject(pwr.getOsoby());
            oos.close();
            oos2.writeObject(pwr.getKursy());
            oos2.close();
            System.out.println("Czy chcesz kontynuować? (true/false)");
            dataLoop=scanner.nextBoolean();
        }
    }
}

