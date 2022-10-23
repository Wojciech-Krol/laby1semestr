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
    public double E_x_WK(){
        double answer=1;
        for(int i=1;i<=k;i++){
            answer+=1/(double)Factorial(i);
        }
        return Pow(answer,x);
    }

}
