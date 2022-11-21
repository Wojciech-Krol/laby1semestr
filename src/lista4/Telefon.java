package lista4;

public class Telefon  extends UrzadzenieMobilne{
    private Boolean czyWKieszeni;
    private Boolean czyWTorbie;
    private int licznikKrokow;
    private Boolean czyWlaczonyLicznikKrokow=false;

    public Telefon(double srednica, int waga, int ileMiejscNaKartySim, Aparat aparat, boolean czyMaCzytnikLiniiPapilarnych, boolean czyOdblokowany, int ileZdjec, boolean czyPopsuty, boolean czyWlaczony, int ileKartSim, String model, String nazwaProducenta, Boolean czyWKieszeni, Boolean czyWTorbie) {
        super(srednica, waga, ileMiejscNaKartySim, aparat, czyMaCzytnikLiniiPapilarnych, czyOdblokowany, ileZdjec, czyPopsuty, czyWlaczony, ileKartSim, model, nazwaProducenta);
        this.czyWKieszeni = czyWKieszeni;
        this.czyWTorbie = czyWTorbie;
        this.licznikKrokow = 0;
    }
    public Telefon(double srednica, int waga, int ileMiejscNaKartySim, Aparat aparat, boolean czyMaCzytnikLiniiPapilarnych, boolean czyOdblokowany, int ileZdjec, boolean czyPopsuty, boolean czyWlaczony, int ileKartSim, String model, String nazwaProducenta){
        super(srednica, waga, ileMiejscNaKartySim, aparat, czyMaCzytnikLiniiPapilarnych, czyOdblokowany, ileZdjec, czyPopsuty, czyWlaczony, ileKartSim, model, nazwaProducenta);
        this.czyWKieszeni = false;
        this.czyWTorbie = false;
        this.licznikKrokow = 0;
    }
    public Telefon(){
        super();
        this.czyWKieszeni = false;
        this.czyWTorbie = false;
        this.licznikKrokow = 0;
    }
    // GETTERY
    public Boolean getCzyWKieszeni() {return czyWKieszeni;}
    public Boolean getCzyWTorbie() {return czyWTorbie;}
    public int getLicznikKrokow() {return licznikKrokow;}
    public Boolean getCzyWlaczonyLicznikKrokow() {return czyWlaczonyLicznikKrokow;}
    // SETTERY
    public void setCzyWKieszeni(Boolean czyWKieszeni) {this.czyWKieszeni = czyWKieszeni;}
    public void setCzyWTorbie(Boolean czyWTorbie) {this.czyWTorbie = czyWTorbie;}
    public void setLicznikKrokow(int licznikKrokow) {this.licznikKrokow = licznikKrokow;}
    public Boolean setCzyWlaczonyLicznikKrokow(Boolean czyWlaczonyLicznikKrokow) {return this.czyWlaczonyLicznikKrokow = czyWlaczonyLicznikKrokow;}

    public void wlaczLicznikKrokow(){
        this.czyWlaczonyLicznikKrokow = true;
    }
    public void wylaczLicznikKrokow(){
        this.czyWlaczonyLicznikKrokow = false;
    }
}
