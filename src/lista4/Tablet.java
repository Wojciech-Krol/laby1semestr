package lista4;

public class Tablet extends UrzadzenieMobilne{
    private Boolean czyWTorbie;
    private int praceGraficzne;

    public Tablet(){
        super();
        this.czyWTorbie = false;
        this.praceGraficzne = 0;
    }
    public Tablet(double srednica, int waga, int ileMiejscNaKartySim, Aparat aparat, boolean czyMaCzytnikLiniiPapilarnych, boolean czyOdblokowany, int ileZdjec, boolean czyPopsuty, boolean czyWlaczony, int ileKartSim, String model, String nazwaProducenta, Boolean czyWTorbie, int praceGraficzne){
        super(srednica, waga, ileMiejscNaKartySim, aparat, czyMaCzytnikLiniiPapilarnych, czyOdblokowany, ileZdjec, czyPopsuty, czyWlaczony, ileKartSim, model, nazwaProducenta);
        this.czyWTorbie = czyWTorbie;
        this.praceGraficzne = praceGraficzne;
    }
    public Tablet(double srednica, int waga, int ileMiejscNaKartySim, Aparat aparat, boolean czyMaCzytnikLiniiPapilarnych, boolean czyOdblokowany, int ileZdjec, boolean czyPopsuty, boolean czyWlaczony, int ileKartSim, String model, String nazwaProducenta){
        super(srednica, waga, ileMiejscNaKartySim, aparat, czyMaCzytnikLiniiPapilarnych, czyOdblokowany, ileZdjec, czyPopsuty, czyWlaczony, ileKartSim, model, nazwaProducenta);
        this.czyWTorbie = false;
        this.praceGraficzne = 0;
    }
    // GETTERY
    public Boolean getCzyWTorbie() {return czyWTorbie;}
    public int getPraceGraficzne() {return praceGraficzne;}
    // SETTERY
    public void setCzyWTorbie(Boolean czyWTorbie) {this.czyWTorbie = czyWTorbie;}
    public void setPraceGraficzne(int praceGraficzne) {this.praceGraficzne = praceGraficzne;}
}
