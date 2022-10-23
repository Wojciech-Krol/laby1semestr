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
        if(k>6){
            k=6;
        }
        this.x=x;
        this.k=k;
    }

    public double Sin_x_WK(){
        double answer=x;
        for(int i=1;i<=k;i++){
            answer+=Pow(-1,i)*(Pow(x,2*i+1)/Factorial(2*i+1));
        }
        return answer;
    }
}
