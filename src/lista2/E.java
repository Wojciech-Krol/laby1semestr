package lista2;

public class E extends Main{
    private int k;
    private int x;
    E(int x, int k){
        if(k>19){
            k=19;
        }
        if(x>35){
            System.out.println("UWAGA! Wyniki przy obliczaniu e^x dla x>35 mogą być zakłamane, gdyż wartości mogą wyjść poza zakres");
        }
        this.x=x;
        this.k=k;
    }
    public double E_x_WK_zad3(){
        double answer=1;
        double licznik=1;
        double mianownik=1;

        for(int i=1;i<=k;i++){ //mniejsza dokladnosc, mniej mnozen, szybciej wychodzi poza zakres longa
            licznik*=x;
            mianownik*=i;
            answer+=licznik/mianownik;
        }
        return answer;
    }
    public double E_x_WK_zad4(){
        double answer=1;
        for(int i=1;i<=k;i++){ //dokladniejszy algorytm, ale wiecej mnozen, pozniej wychodzi poza zakres longa
            //answer+=Pow(x,i)/(double)Factorial(i); <-- "wzor" z wykladu
            answer+=1/(double)Factorial(i);

        }
        return Pow(answer,x);
    }

}
