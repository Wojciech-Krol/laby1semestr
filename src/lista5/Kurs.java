package lista5;

import java.io.Serializable;

public class Kurs implements Serializable {
    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }

    public pracownikDydaktycznoBadawczy getProwadzacy() {
        return prowadzacy;
    }

    public void setProwadzacy(pracownikDydaktycznoBadawczy prowadzacy) {
        this.prowadzacy = prowadzacy;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    private String nazwaKursu;
    private pracownikDydaktycznoBadawczy prowadzacy;
    private int ECTS;

    public Kurs(String nazwaKursu, pracownikDydaktycznoBadawczy prowadzacy, int ECTS) {
        this.nazwaKursu=nazwaKursu;
        this.prowadzacy=prowadzacy;
        this.ECTS=ECTS;
    }

    public void wyswietlDaneKursu(){
        System.out.println("Nazwa kursu: "+nazwaKursu);
        if(this.prowadzacy==null){
            System.out.println("Brak prowadzącego");
        }
        else{
            System.out.println("Prowadzący: "+prowadzacy.getImie()+" "+prowadzacy.getNazwisko());
        }
        System.out.println("ECTS: "+ECTS);
    }
}
