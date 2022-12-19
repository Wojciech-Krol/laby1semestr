package lista5;

public abstract class pracownikUczelni extends Osoba{
    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    private String stanowisko;
    private int stazPracy;
    private int pensja;

    public pracownikUczelni(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, int pensja) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.stanowisko=stanowisko;
        this.stazPracy=stazPracy;
        this.pensja=pensja;
    }

    public void wyswietlDanePracownika(){
        System.out.println("Imie: "+getImie());
        System.out.println("Nazwisko: "+getNazwisko());
        System.out.println("PESEL: "+getPESEL());
        System.out.println("Wiek: "+getWiek());
        System.out.println("Plec: "+getPlec());
        System.out.println("Stanowisko: "+getStanowisko());
        System.out.println("Staz pracy: "+getStazPracy());
        System.out.println("Pensja: "+getPensja());
    }

}
