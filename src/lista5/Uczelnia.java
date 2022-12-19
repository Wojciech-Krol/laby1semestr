package lista5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Uczelnia implements Serializable {

    public static ArrayList<Osoba> getOsoby() {
        return osoby;
    }

    public void setOsoby(ArrayList<Osoba> osoby) {
        this.osoby = osoby;
    }

    public ArrayList<String> getStanowiskaPracy1() {
        return stanowiskaPracy1;
    }

    public void setStanowiskaPracy1(ArrayList<String> stanowiskaPracy1) {
        this.stanowiskaPracy1 = stanowiskaPracy1;
    }

    public ArrayList<String> getStanowiskaPracy2() {
        return stanowiskaPracy2;
    }

    public void setStanowiskaPracy2(ArrayList<String> stanowiskaPracy2) {
        this.stanowiskaPracy2 = stanowiskaPracy2;
    }

    public ArrayList<Kurs> getKursy() {
        return kursy;
    }

    public void setKursy(ArrayList<Kurs> kursy) {
        this.kursy = kursy;
    }

    static ArrayList<Osoba> osoby= new ArrayList<>();
    ArrayList<String> stanowiskaPracy1= new ArrayList<String>(Arrays.asList("Asystent","Adiunkt","Profesor Nadzwyczajny","Profesor Zwyczajny","Wykładowca"));
    ArrayList<String> stanowiskaPracy2= new ArrayList<String>(Arrays.asList("Referent","Specjalista","Starszy Specjalista"));
    ArrayList<Kurs> kursy= new ArrayList<>();

    public void dodajPracownika(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, int pensja, int liczbaPublikacji, int liczbaNadgodzin){
        if(stanowiskaPracy1.contains(stanowisko)){
            osoby.add(new pracownikDydaktycznoBadawczy(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja, liczbaPublikacji));
        }
        else if(stanowiskaPracy2.contains(stanowisko)){
            osoby.add(new pracownikAdministracyjny(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja, liczbaNadgodzin));
        }
        else{
            System.out.println("Nie ma takiego stanowiska pracy");
        }
    }
    public void dodajStudenta(String imie, String nazwisko, String PESEL, int wiek, String plec, int nrIndeksu, int rokStudiow, ArrayList<Kurs> listaKursow, Boolean czyErasmus, Boolean czy1Stopien, Boolean czy2Stopien, Boolean czyStacjonarnie, Boolean czyNieStacjonarnie){
        osoby.add(new Student(imie, nazwisko, PESEL, wiek, plec, nrIndeksu, rokStudiow, listaKursow, czyErasmus, czy1Stopien, czy2Stopien, czyStacjonarnie, czyNieStacjonarnie));
    }
    public void dodajKurs(String nazwaKursu,pracownikDydaktycznoBadawczy prowadzacyKursu, int ECTS){
        kursy.add(new Kurs(nazwaKursu,prowadzacyKursu,ECTS));
    }
    public void przydzielStudentowiKurs(Student student, Kurs kurs){
        student.getListaKursow().add(kurs);
    }
    public void wyswietlDaneWszystkichStudentow(ArrayList<Student> studenci){
        for(Osoba osoba:studenci){
            if(osoba instanceof Student){
                ((Student)osoba).wyswietlDaneStudenta();
            }
        }
    }

    public void wyswietlDaneWszystkichStudentow(){
        for(Osoba osoba:osoby){
            if(osoba instanceof Student){
                ((Student)osoba).wyswietlDaneStudenta();
            }
        }
    }
    public void wyswietlDaneWszystkichPracownikow(){
        for(Osoba osoba:osoby){
            if(osoba instanceof pracownikDydaktycznoBadawczy){
                ((pracownikDydaktycznoBadawczy)osoba).wyswietlDanePracownika();
            }
            else if(osoba instanceof  pracownikAdministracyjny){
                ((pracownikAdministracyjny)osoba).wyswietlDanePracownika();
            }
        }
    }
    public void wyswietlDaneWszystkichPracownikow(ArrayList<pracownikUczelni> pracownicy){
        for(Osoba osoba:pracownicy){
            if(osoba instanceof pracownikDydaktycznoBadawczy){
                ((pracownikDydaktycznoBadawczy)osoba).wyswietlDanePracownika();
            }
            else if(osoba instanceof  pracownikAdministracyjny){
                ((pracownikAdministracyjny)osoba).wyswietlDanePracownika();
            }
        }
    }
    public void wyswietlDaneWszystkichKursow(){
        for(Kurs kurs:kursy){
            kurs.wyswietlDaneKursu();
        }
    }
    public void wyswietlDaneWszystkichKursow(ArrayList<Kurs> kursy){
        for(Kurs kurs:kursy){
            kurs.wyswietlDaneKursu();
        }
    }

    public ArrayList<pracownikUczelni> wyszukajPracownikow(String input){
        ArrayList<pracownikUczelni> wyszukaniPracownicy= new ArrayList<>();
        for(Osoba osoba:osoby){
            if(osoba instanceof pracownikDydaktycznoBadawczy){
                if(((pracownikDydaktycznoBadawczy)osoba).getImie().equals(input) || ((pracownikDydaktycznoBadawczy)osoba).getNazwisko().equals(input) ||  Integer.toString(((pracownikDydaktycznoBadawczy)osoba).getStazPracy()).equals(input) || ((pracownikDydaktycznoBadawczy)osoba).getStanowisko().equals(input) || Integer.toString(((pracownikDydaktycznoBadawczy)osoba).getPensja()).equals(input) || Integer.toString(((pracownikDydaktycznoBadawczy)osoba).getLiczbaPublikacji()).equals(input)){
                    wyszukaniPracownicy.add((pracownikDydaktycznoBadawczy)osoba);
                }
            }
            else if(osoba instanceof  pracownikAdministracyjny){
                if(((pracownikAdministracyjny)osoba).getImie().equals(input) || ((pracownikAdministracyjny)osoba).getNazwisko().equals(input) ||  Integer.toString(((pracownikAdministracyjny)osoba).getStazPracy()).equals(input) || ((pracownikAdministracyjny)osoba).getStanowisko().equals(input) || Integer.toString(((pracownikAdministracyjny)osoba).getPensja()).equals(input) || Integer.toString(((pracownikAdministracyjny)osoba).getLiczbaNadgodzin()).equals(input)){
                    wyszukaniPracownicy.add((pracownikAdministracyjny)osoba);
                }
            }
        }
        return wyszukaniPracownicy;
    }

    public ArrayList<Kurs> wyszukajKursy(String input){
        ArrayList<Kurs> wyszukaneKursy= new ArrayList<>();
        for(Kurs kurs:kursy){
            if(kurs.getNazwaKursu().equals(input) || (kurs.getProwadzacy().getImie()+" "+ kurs.getProwadzacy().getNazwisko()).equals(input) || Integer.toString(kurs.getECTS()).equals(input)){
                wyszukaneKursy.add(kurs);
            }
        }
        return wyszukaneKursy;
    }

    public ArrayList<Student> wyszukajStudentow(String input){
        ArrayList<Student> wyszukaniStudenci= new ArrayList<>();
        for(Osoba osoba:osoby){
            if(osoba instanceof Student){
                if(((Student)osoba).getImie().equals(input) || ((Student)osoba).getNazwisko().equals(input) ||  Integer.toString(((Student)osoba).getNrIndeksu()).equals(input) || Integer.toString(((Student)osoba).getRokStudiow()).equals(input)){
                    wyszukaniStudenci.add((Student)osoba);
                }
                else {
                    for (Kurs kurs : ((Student) osoba).getListaKursow()) {
                        if (kurs.getNazwaKursu().equals(input)) {
                            wyszukaniStudenci.add((Student)osoba);
                        }
                    }
                }
            }
        }
        return wyszukaniStudenci;
    }

    public ArrayList<Osoba> sortujOsobyPoNazwisku() {
        ArrayList<Osoba> posortowaneOsoby = new ArrayList<>();
        posortowaneOsoby.addAll(osoby);
        Collections.sort(posortowaneOsoby, new Comparator<Osoba>() {
            public int compare(Osoba p1, Osoba p2) {
                return p1.getNazwisko().compareTo(p2.getNazwisko());
            }
        });
        return posortowaneOsoby;
    }

    public ArrayList<Osoba> sortujOsobyPoNazwiskuIImieniu() {
        ArrayList<Osoba> posortowaneOsoby = new ArrayList<>();
        posortowaneOsoby.addAll(osoby);
        Collections.sort(posortowaneOsoby, new Comparator<Osoba>() {
            public int compare(Osoba p1, Osoba p2) {
                if(p1.getNazwisko().compareTo(p2.getNazwisko())==0){
                    return p1.getImie().compareTo(p2.getImie());
                }
                else{
                    return p1.getNazwisko().compareTo(p2.getNazwisko());
                }
            }
        });
        return posortowaneOsoby;
    }

    public ArrayList<Osoba> sortujOsobyPoNazwiskuIWieku(){
        ArrayList<Osoba> posortowaneOsoby = new ArrayList<>();
        posortowaneOsoby.addAll(osoby);
        Collections.sort(posortowaneOsoby, new Comparator<Osoba>() {
            public int compare(Osoba p1, Osoba p2) {
                if(p1.getNazwisko().compareTo(p2.getNazwisko())==0){
                    return p2.getWiek()-p1.getWiek();
                }
                else{
                    return p1.getNazwisko().compareTo(p2.getNazwisko());
                }
            }
        });
        return posortowaneOsoby;
    }

    public ArrayList<Kurs> sortujKursyPoECTSachiNazwiskachProwadzacych() {
    ArrayList<Kurs> posortowaneKursy = new ArrayList<>();
    posortowaneKursy.addAll(kursy);
    Collections.sort(posortowaneKursy, new Comparator<Kurs>() {
        public int compare(Kurs kurs1, Kurs kurs2){
            if(kurs1.getECTS()==kurs2.getECTS()){
                return (kurs1.getProwadzacy().getNazwisko()).compareTo(kurs2.getProwadzacy().getNazwisko());
            }
            else{
                return kurs1.getECTS()-kurs2.getECTS();
            }
            }
        });
    return posortowaneKursy;
    }
    public void usunKursy(ArrayList<Kurs> kurs){
        kursy.removeAll(kurs);
    }
    public void usunPracownikow(ArrayList<pracownikUczelni> pracownicy){
        osoby.removeAll(pracownicy);
        for (Kurs kurs:kursy) {
            for(pracownikUczelni pracownik:pracownicy){
                if(kurs.getProwadzacy()==pracownik){
                    kurs.setProwadzacy(null);
                }
            }
        }

    }
    public void usunStudentow(ArrayList<Student> studenci){
        osoby.removeAll(studenci);
    }

    public void przydzielProwadzacego(Kurs kurs, pracownikDydaktycznoBadawczy pracownik){
        kurs.setProwadzacy(pracownik);
    }
    public void odlaczProwadzacego(Kurs kurs){
        kurs.setProwadzacy(null);
    }
}
