package lista4;

public class Uzytkownik {
    public static void schowajDoKieszeni(Telefon telefon){
        telefon.setCzyWTorbie(false);
        telefon.setCzyWKieszeni(true);
    }
    public static void schowajDoTorby(Telefon telefon){
        telefon.setCzyWTorbie(true);
        telefon.setCzyWKieszeni(false);
    }
    public static void schowajDoTorby(Tablet tablet){
        if(tablet.getCzyWTorbie()) {
            System.out.println("Tablet jest już w torbie");
        }else{
            tablet.setCzyWTorbie(true);
        }
    }
    public static void wyciagnijZTorby(Tablet tablet){
        if(tablet.getCzyWTorbie()){
            tablet.setCzyWTorbie(false);
        }
        else{
            System.out.println("Tablet nie jest w torbie");
        }
    }
    public static void naprawUSerwisanta(UrzadzenieMobilne urzadzenieMobilne){
        if(urzadzenieMobilne.getCzyPopsuty()){
            urzadzenieMobilne.setCzyPopsuty(false);
        }
        else{
            System.out.println("Urzadzenie nie jest popsute");
        }
    }
    public static void idzPobiegac(Telefon telefon){
        if(telefon.getCzyWlaczonyLicznikKrokow()){
            telefon.setLicznikKrokow(telefon.getLicznikKrokow() + 1000);
        }
        else{
            System.out.println("Licznik krokow nie jest wlaczony");
        }
    }


}
