package lista3;
import java.util.Random;



public class Main {
    public static void wypiszKompaktowo(tablica1Wymiar t){
        System.out.println("Elementy tablicy od lewej: ");
        t.wypiszTabliceOdLewej();
        System.out.println("Elementy tablicy od prawej: ");
        t.wypiszTabliceOdPrawej();
        System.out.println("Maksimum: "+t.znajdzMaksimum());
        System.out.println("Minimum: "+t.znajdzMinimum());
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
    }
}

