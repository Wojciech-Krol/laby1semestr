package lista4;

public class urzadzeniaMobilne {

    public static void main(String[] args){
        Telefon telefon = new Telefon(14, 169, 2, new Aparat(), true, false, 0, false, false, 0, "Galaxy S22", "Samsung");
        Telefon t2 = new Telefon();
        Tablet tablet = new Tablet();
        Uzytkownik uzytkownik = new Uzytkownik();
        Aparat aparat = new Aparat();
        telefon.getParametry();

    }

}
