package lista3;

import java.util.Random;

public class Macierz {
    private int macierz[][],wiersze,kolumny;
    Macierz(int w, int k){
        this.wiersze=w;
        this.kolumny=k;
        this.macierz=new int[wiersze][kolumny];
    }
    public void uzupelnijNaturalnymiLiczbamiLosowymi(int K){
        Random r = new Random();
        for(int i=0;i<wiersze;i++){
            for(int j=0;j<kolumny;j++){
                macierz[i][j]=r.nextInt(K);
            }
        }
    }
    public void wypiszMacierz(){
        for(int i=0;i<wiersze;i++){
            for(int j=0;j<kolumny;j++){
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int znajdzMaksimum(){
        int max=macierz[0][0];
        for(int i=0;i<wiersze;i++){
            for(int j=0;j<kolumny;j++){
                if(macierz[i][j]>max){
                    max=macierz[i][j];
                }
            }
        }
        return max;
    }
    public int znajdzMinimum(){
        int min=macierz[0][0];
        for(int i=0;i<wiersze;i++){
            for(int j=0;j<kolumny;j++){
                if(macierz[i][j]<min){
                    min=macierz[i][j];
                }
            }
        }
        return min;
    }
    public void setWartosc(int wartosc, int wiersz, int kolumna){
        if(wiersz<0 || wiersz>=wiersze || kolumna<0 || kolumna>=kolumny){
            System.out.println("Niepoprawna pozycja");
            return;
        }
        macierz[wiersz][kolumna]=wartosc;
    }
    public int getWartosc(int wiersz, int kolumna){
        if(wiersz<0 || wiersz>=wiersze || kolumna<0 || kolumna>=kolumny){
            System.out.println("Niepoprawna pozycja");
            return -1;
        }
        return macierz[wiersz][kolumna];
    }
    public void dodajMacierz(Macierz m){
        if(m.wiersze!=this.wiersze || m.kolumny!=this.kolumny){
            System.out.println("Niepoprawne wymiary macierzy");
            return;
        }
        for(int i=0;i<wiersze;i++){
            for(int j=0;j<kolumny;j++){
                this.macierz[i][j]+=m.macierz[i][j];
            }
        }
    }
    public void mnozPrzezMacierz(Macierz m){
        if(this.kolumny!=m.wiersze){
            System.out.println("Niepoprawne wymiary macierzy");
            return;
        }
        int nowaMacierz[][]=new int[this.wiersze][m.kolumny];
        for(int i=0;i<this.wiersze;i++){
            for(int j=0;j<m.kolumny;j++){
                for(int k=0;k<this.kolumny;k++){
                    nowaMacierz[i][j]+=this.macierz[i][k]*m.macierz[k][j];
                }
            }
        }
        this.macierz=nowaMacierz;
        this.kolumny=m.kolumny;
    }
}
