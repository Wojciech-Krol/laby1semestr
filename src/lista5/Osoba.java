package lista5;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    private String imie;
    private String nazwisko;
    private String PESEL;
    private int wiek;
    private String plec;


    public Osoba(String imie, String nazwisko, String pesel, int wiek, String plec) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.PESEL=pesel;
        this.wiek=wiek;
        this.plec=plec;
    }
    public Osoba wyszukajOsobePoPeselu(String PESEL){
        if (getPESEL().equals(PESEL)){
            return this;
        }
        else{
            return null;
        }
    }
}
