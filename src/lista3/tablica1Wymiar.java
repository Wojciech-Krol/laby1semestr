package lista3;

import java.util.Random;

public class tablica1Wymiar {
    private int tablica[],wielkosc,K;
    tablica1Wymiar(int w){
        this.wielkosc=w;
        this.tablica=new int[wielkosc];
    }

    public void uzupelnijNaturalnymiLiczbamiLosowymi(int K){
        this.K=K;
        Random r = new Random();
        for(int i=0;i<wielkosc;i++){
            tablica[i]=r.nextInt(K);
        }
    }
    public void wypiszTabliceOdLewej(){
        for(int i=0;i<wielkosc;i++){
            System.out.print(tablica[i]+" ");
        }
        System.out.println();
    }

    public void wypiszTabliceOdPrawej(){
        for(int i=wielkosc-1;i>=0;i--){
            System.out.print(tablica[i]+" ");
        }
        System.out.println();
    }

    public int znajdzMaksimum(){
        int max=tablica[0];
        for(int i=1;i<wielkosc;i++){
            if(tablica[i]>max){
                max=tablica[i];
            }
        }
        return max;
    }

    public int znajdzMinimum(){
        int min=tablica[0];
        for(int i=1;i<wielkosc;i++){
            if(tablica[i]<min){
                min=tablica[i];
            }
        }
        return min;
    }

    public void setWartosc(int wartosc, int pozycja){
        if(pozycja<0 || pozycja>=wielkosc){
            System.out.println("Niepoprawna pozycja");
            return;
        }
        tablica[pozycja]=wartosc;
    }

    public int getWartosc(int pozycja){
        if(pozycja<0 || pozycja>=wielkosc){
            System.out.println("Niepoprawna pozycja");
            return -1;
        }
        return tablica[pozycja];
    }
    private int ileParzystych(){
        int ile=0;
        for(int i=0;i<wielkosc;i++){
            if(tablica[i]%2==0){
                ile++;
            }
        }
        return ile;
    }
    private int ileNieparzystych(){
        int ile=0;
        for(int i=0;i<wielkosc;i++){
            if(tablica[i]%2!=0){
                ile++;
            }
        }
        return ile;
    }

    public tablica1Wymiar getParzyste(){
        tablica1Wymiar parzyste=new tablica1Wymiar(ileParzystych());
        int j=0;
        for(int i=0;i<wielkosc;i++){
            if(tablica[i]%2==0){
                parzyste.setWartosc(tablica[i], j);
                j++;
            }
        }
        return parzyste;
    }

    public tablica1Wymiar getNieparzyste(){
        tablica1Wymiar nieparzyste=new tablica1Wymiar(ileNieparzystych());
        int j=0;
        for(int i=0;i<wielkosc;i++){
            if(tablica[i]%2!=0){
                nieparzyste.setWartosc(tablica[i], j);
                j++;
            }
        }
        return nieparzyste;
    }
    /*public void podzielNaParzysteINieparzyste(){
        tablica1Wymiar parzyste = new tablica1Wymiar(wielkosc);
        tablica1Wymiar nieparzyste = new tablica1Wymiar(wielkosc);
        int ileParzystych=0,ileNieparzystych=0;
        for(int i=0;i<wielkosc;i++){
            if(tablica[i]%2==0){
               //parzyste[ileParzystych]=tablica[i];
                parzyste.setWartosc(tablica[i],ileParzystych);
                ileParzystych++;
            }
            else{
                //nieparzyste[ileNieparzystych]=tablica[i];
                nieparzyste.setWartosc(tablica[i],ileNieparzystych);
                ileNieparzystych++;
            }
        }
        System.out.println("Parzyste:");
        parzyste.wypiszTabliceOdLewej();
        System.out.println("Nieparzyste:");
        nieparzyste.wypiszTabliceOdLewej();
        System.out.println();
    }*/

}
