package lista4;

public class Aparat {
    private int ileMpx;
    private String obslugiwaneRozdzielczosci[];
    private int ileObiektywow;
    private int ileTrybowZdjeciowych;
    private Boolean czyFlashWlaczony;

    public Aparat(){
        this.ileMpx = 48;
        this.obslugiwaneRozdzielczosci = new String[]{"1280x720", "1920x1080", "2560x1440"};
        this.ileObiektywow = 2;
        this.ileTrybowZdjeciowych = 5;
        this.czyFlashWlaczony = false;
    }
    public Aparat(int ileMpx, String[] obslugiwaneRozdzielczosci, int ileObiektywow, int ileTrybowZdjeciowych, Boolean czyFlashWlaczony){
        this.ileMpx = ileMpx;
        this.obslugiwaneRozdzielczosci = obslugiwaneRozdzielczosci;
        this.ileObiektywow = ileObiektywow;
        this.ileTrybowZdjeciowych = ileTrybowZdjeciowych;
        this.czyFlashWlaczony = czyFlashWlaczony;
    }
    // GETTERY
    public int getIleMpx() {return ileMpx;}
    public String[] getObslugiwaneRozdzielczosci() {return obslugiwaneRozdzielczosci;}
    public int getIleObiektywow() {return ileObiektywow;}
    public int getIleTrybowZdjeciowych() {return ileTrybowZdjeciowych;}
    public Boolean getCzyFlashWlaczony() {return czyFlashWlaczony;}
    // SETTERY
    public void setIleMpx(int ileMpx) {this.ileMpx = ileMpx;}
    public void setObslugiwaneRozdzielczosci(String[] obslugiwaneRozdzielczosci) {this.obslugiwaneRozdzielczosci = obslugiwaneRozdzielczosci;}
    public void setIleObiektywow(int ileObiektywow) {this.ileObiektywow = ileObiektywow;}
    public void setIleTrybowZdjeciowych(int ileTrybowZdjeciowych) {this.ileTrybowZdjeciowych = ileTrybowZdjeciowych;}
    public void setCzyFlashWlaczony(Boolean czyFlashWlaczony) {this.czyFlashWlaczony = czyFlashWlaczony;}


}
