package lista5;

public class pracownikDydaktycznoBadawczy extends pracownikUczelni{
   public int getLiczbaPublikacji() {
      return liczbaPublikacji;
   }

   public void setLiczbaPublikacji(int liczbaPublikacji) {
      this.liczbaPublikacji = liczbaPublikacji;
   }

   private int liczbaPublikacji;


   public pracownikDydaktycznoBadawczy(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, int pensja, int liczbaPublikacji) {
      super(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja);
      this.liczbaPublikacji=liczbaPublikacji;
   }

   public void wyswietlDanePracownika(){
      super.wyswietlDanePracownika();
      System.out.println("Liczba publikacji: "+liczbaPublikacji);
   }
}
