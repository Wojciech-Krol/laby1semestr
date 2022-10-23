package lista2;

public class Cos extends Main{
    private double x;
    private int k;

    Cos(double x, int k){
        while(x>Math.PI){
            x-=Math.PI*2;
        }
        while(x<-Math.PI){
            x+=Math.PI*2;
        }
        if(k>8) {
            k = 8;
        }
        this.x=x;
        this.k=k;
    }

    public double Cos_x_WK(){
        double answer=1;
        for(int i=1;i<=k;i++){
            answer+=Pow(-1,i)*(Pow(x,2*i)/Factorial(2*i));
        }
        return answer;
    }
}