package lista3;


public class Main{
    public static void wypiszKompaktowo(tablica1Wymiar t){
        System.out.println("Elementy tablicy od lewej: ");
        t.wypiszTabliceOdLewej();
        System.out.println("Elementy tablicy od prawej: ");
        t.wypiszTabliceOdPrawej();
        System.out.println("Maksimum: "+t.znajdzMaksimum());
        System.out.println("Minimum: "+t.znajdzMinimum());
    }
    public static void wypiszKompaktowo(Macierz m){
        System.out.println("Elementy macierzy ");
        m.wypiszMacierz();
        System.out.println("Maksimum: "+m.znajdzMaksimum());
        System.out.println("Minimum: "+m.znajdzMinimum());
    }

    public static void main(String[] args) {
        tablica1Wymiar tab = new tablica1Wymiar(10);
        tab.uzupelnijNaturalnymiLiczbamiLosowymi(100);
        System.out.println("Tablica przed zmianami: ");
        wypiszKompaktowo(tab);
        tablica1Wymiar parzyste=tab.getParzyste();
        System.out.println("Parzyste: ");
        wypiszKompaktowo(parzyste);
        System.out.println("Nieparzyste: ");
        tablica1Wymiar nieparzyste=tab.getNieparzyste();
        wypiszKompaktowo(nieparzyste);
        Macierz m1 = new Macierz(4,4);
        Macierz m2 = new Macierz(4,4);
        m1.uzupelnijNaturalnymiLiczbamiLosowymi(100);
        m2.uzupelnijNaturalnymiLiczbamiLosowymi(100);
        wypiszKompaktowo(m1);
        wypiszKompaktowo(m2);
        m1.dodajMacierz(m2);
        wypiszKompaktowo(m1);
        m1.mnozPrzezMacierz(m2);
        wypiszKompaktowo(m1);
    }
}

