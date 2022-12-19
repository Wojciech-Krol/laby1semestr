package lista5;

public class pracownikAdministracyjny extends pracownikUczelni {
    public int getLiczbaNadgodzin() {
        return liczbaNadgodzin;
    }

    public void setLiczbaNadgodzin(int liczbaNadgodzin) {
        this.liczbaNadgodzin = liczbaNadgodzin;
    }

    private int liczbaNadgodzin;


    public pracownikAdministracyjny(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, int pensja, int liczbaNadgodzin) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja);
        this.liczbaNadgodzin=liczbaNadgodzin;
    }

    public void wyswietlDanePracownika(){
        super.wyswietlDanePracownika();
        System.out.println("Liczba nadgodzin: "+liczbaNadgodzin);
    }
}
