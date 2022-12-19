package lista5;

import java.util.ArrayList;

public class Student extends Osoba{
    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public ArrayList<Kurs> getListaKursow() {
        return listaKursow;
    }

    public void setListaKursow(ArrayList<Kurs> listaKursow) {
        this.listaKursow = listaKursow;
    }

    public Boolean getCzyErasmus() {
        return czyErasmus;
    }

    public void setCzyErasmus(Boolean czyErasmus) {
        this.czyErasmus = czyErasmus;
    }

    public Boolean getCzy1Stopien() {
        return czy1Stopien;
    }

    public void setCzy1Stopien(Boolean czy1Stopien) {
        this.czy1Stopien = czy1Stopien;
    }

    public Boolean getCzy2Stopien() {
        return czy2Stopien;
    }

    public void setCzy2Stopien(Boolean czy2Stopien) {
        this.czy2Stopien = czy2Stopien;
    }

    public Boolean getCzyStacjonarnie() {
        return czyStacjonarnie;
    }

    public void setCzyStacjonarnie(Boolean czyStacjonarnie) {
        this.czyStacjonarnie = czyStacjonarnie;
    }

    public Boolean getCzyNieStacjonarnie() {
        return czyNieStacjonarnie;
    }

    public void setCzyNieStacjonarnie(Boolean czyNieStacjonarnie) {
        this.czyNieStacjonarnie = czyNieStacjonarnie;
    }

    private int nrIndeksu;
    private int rokStudiow;
    private ArrayList<Kurs> listaKursow;
    private Boolean czyErasmus,czy1Stopien,czy2Stopien,czyStacjonarnie,czyNieStacjonarnie;

    public Student(String imie, String nazwisko, String PESEL, int wiek, String plec, int nrIndeksu, int rokStudiow, ArrayList<Kurs> listaKursow, Boolean czyErasmus, Boolean czy1Stopien, Boolean czy2Stopien,Boolean czyStacjonarnie,Boolean czyNieStacjonarnie) {
        super(imie, nazwisko, PESEL, wiek, plec);
        this.nrIndeksu = nrIndeksu;
        this.rokStudiow = rokStudiow;
        this.listaKursow = listaKursow;
        this.czyErasmus = czyErasmus;
        this.czy1Stopien = czy1Stopien;
        this.czy2Stopien = czy2Stopien;
        this.czyStacjonarnie=czyStacjonarnie;
        this.czyNieStacjonarnie=czyNieStacjonarnie;
    }

    public void wyswietlDaneStudenta(){
        System.out.println("Imie: "+getImie());
        System.out.println("Nazwisko: "+getNazwisko());
        System.out.println("PESEL: "+getPESEL());
        System.out.println("Wiek: "+getWiek());
        System.out.println("Plec: "+getPlec());
        System.out.println("Numer indeksu: "+nrIndeksu);
        System.out.println("Rok studiow: "+rokStudiow);
        System.out.println("Czy Erasmus: "+czyErasmus);
        System.out.println("Czy 1 stopien: "+czy1Stopien);
        System.out.println("Czy 2 stopien: "+czy2Stopien);
        System.out.println("Czy stacjonarnie: "+czyStacjonarnie);
        System.out.println("Czy nie stacjonarnie: "+czyNieStacjonarnie);
        System.out.println("Lista kursow: ");
        for(Kurs k:listaKursow){
            System.out.println(k.getNazwaKursu());
        }
    }


}
