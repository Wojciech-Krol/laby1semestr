package lista2;

public class Sin extends Main{
    private double x;
    private int k;

    Sin(double x, int k){
        while(x>Math.PI*2){
            x-=Math.PI*2;
        }
        while(x<0){
            x+=Math.PI*2;
        }
        if(k>300){
            k=300;
        }
        this.x=x;
        this.k=k;
    }

    public double Sin_x_WK_zad4(){
        double answer=x;
        for(int i=1;i<=k;i++){
            answer+=Pow(-1,i)*(Pow(x,2*i+1)/Factorial(2*i+1)); //mniejsza dokladnosc, wiecej mnozen,
        }
        return answer;
    }
    public double Sin_x_WK_zad3(){
        double answer=x;
        double licznik=x;
        double mianownik=1;
        double znak =-1;
        for(int i=1;i<=k;i++){
            licznik*=(x*x);
            mianownik*=(2*i*(2*i+1));
            answer+=znak*licznik/mianownik;    //wieksza dokladnosc, mniej mnozen
            znak*=-1;
        }
        return answer;
    }

}
