package lista4;

public abstract class UrzadzenieMobilne {
    private double srednica;
    private int waga;
    private int ileMiejscNaKartySim;
    private Aparat aparat;
    private boolean czyMaCzytnikLiniiPapilarnych;
    private boolean czyOdblokowany;
    private int ileZdjec;
    private boolean czyPopsuty;
    private boolean czyWlaczony;
    private int ileKartSim;
    private String nazwaProducenta;
    private String model;

    public UrzadzenieMobilne(){
        this.srednica = 15.1;
        this.waga = 101;
        this.ileMiejscNaKartySim = 2;
        this.aparat = null;
        this.czyMaCzytnikLiniiPapilarnych = false;
        this.czyOdblokowany = false;
        this.ileZdjec = 0;
        this.czyPopsuty = false;
        this.czyWlaczony = false;
        this.ileKartSim = 0;
        this.nazwaProducenta = "Samsung";
        this.model= "Galaxy S10";
    }

    public UrzadzenieMobilne(double srednica, int waga, int ileMiejscNaKartySim, Aparat aparat, boolean czyMaCzytnikLiniiPapilarnych, boolean czyOdblokowany, int ileZdjec, boolean czyPopsuty, boolean czyWlaczony, int ileKartSim, String model, String nazwaProducenta) {
        this.srednica = srednica;
        this.waga = waga;
        this.ileMiejscNaKartySim = ileMiejscNaKartySim;
        this.aparat = aparat;
        this.czyMaCzytnikLiniiPapilarnych = czyMaCzytnikLiniiPapilarnych;
        this.czyOdblokowany = czyOdblokowany;
        this.ileZdjec = ileZdjec;
        this.czyPopsuty = czyPopsuty;
        this.czyWlaczony = czyWlaczony;
        this.ileKartSim = ileKartSim;
        this.nazwaProducenta= nazwaProducenta;
        this.model= model;
    }
/// GETTERY
    public Aparat getAparat() {
        return aparat;
    }
    public double getSrednica() {
        return srednica;
    }
    public int getWaga() {
        return waga;
    }
    public int getIleMiejscNaKartySim() {
        return ileMiejscNaKartySim;
    }
    public boolean getCzyMaCzytnikLiniiPapilarnych() {
        return czyMaCzytnikLiniiPapilarnych;
    }
    public int getIleZdjec() {
        return ileZdjec;
    }
    public boolean getCzyPopsuty() {
        return czyPopsuty;
    }
    public boolean getCzyWlaczony() {
        return czyWlaczony;
    }
    public boolean getCzyOdblokowany() {return czyOdblokowany;}
    public int getIleKartSim() {return ileKartSim;}
    public String getNazwaProducenta() {return nazwaProducenta;}
    public String getModel() {return model;}
///SETTERY
    public void setSrednicawCm(double srednica) {this.srednica = srednica;}
    public void setWagawGramach(int waga) {this.waga = waga;}
    public void setIleMiejscNaKartySim(int ileMiejscNaKartySim) {this.ileMiejscNaKartySim = ileMiejscNaKartySim;}
    public void setCzyMaCzytnikLiniiPapilarnych(boolean czyMaCzytnikLiniiPapilarnych) {this.czyMaCzytnikLiniiPapilarnych = czyMaCzytnikLiniiPapilarnych;}
    public void setCzyPopsuty(boolean czyPopsuty) {this.czyPopsuty = czyPopsuty;}
    public void setAparat(Aparat aparat) {this.aparat = aparat;}
    public void setIleZdjec(int ileZdjec) {this.ileZdjec = ileZdjec;}
    public void setModel(String model) {this.model = model;}
    public void setNazwaProducenta(String nazwaProducenta) {this.nazwaProducenta = nazwaProducenta;}
    public void getParametry(){
        System.out.print("Parametry urzadzenia "+ this.getClass().getSimpleName() + " Firmy "+ nazwaProducenta +" Model "+ model+ "\n Srednica w cm: " + srednica + "\n Waga w gramach: " + waga
                + "\n Ile miejsc na karty sim: " + ileMiejscNaKartySim + "\n Czy ma czytnik linii papilarnych: "
                + czyMaCzytnikLiniiPapilarnych + "\n Czy odblokowany: " + czyOdblokowany + "\n Ile zdjec: "
                + ileZdjec + "\n Czy popsuty: " + czyPopsuty + "\n Czy wlaczony: " + czyWlaczony);
    }
    public void Wylacz(){
        if (czyWlaczony){
            czyWlaczony = false;
            System.out.println("Urzadzenie zostalo wylaczone");
        }
        else{
            System.out.println("Urzadzenie jest juz wylaczone");
        }
    }
    public void Wlacz(){
        if (czyWlaczony){
            System.out.println("Urzadzenie jest juz wlaczone");
        }
        else{
            czyWlaczony = true;
            System.out.println("Urzadzenie zostalo wlaczone");
        }
    }
    public void Odblokuj(){
        if (czyOdblokowany){
            System.out.println("Urzadzenie jest juz odblokowane");
        }
        else{
            czyOdblokowany = true;
            System.out.println("Urzadzenie zostalo odblokowane");
        }
    }
    public void Zablokuj(){
        if (czyOdblokowany){
            czyOdblokowany = false;
            System.out.println("Urzadzenie zostalo zablokowane");
        }
        else{
            System.out.println("Urzadzenie jest juz zablokowane");
        }
    }
    public void wlozKarteSim(){
        if (ileKartSim < ileMiejscNaKartySim){
            ileKartSim++;
            System.out.println("Karta sim zostala wlozona, jest ich teraz " + ileKartSim + " na " + ileMiejscNaKartySim);
        }
        else{
            System.out.println("Nie mozna wlozyc karty sim");
        }
    }
    public void wyciagnijKarteSim(){
        if (ileKartSim > 0){
            ileKartSim--;
            System.out.println("Karta sim zostala wyciagnieta, jest ich teraz " + ileKartSim + " na " + ileMiejscNaKartySim);
        }
        else{
            System.out.println("Nie mozna wyciagnac karty sim");
        }
    }
}
