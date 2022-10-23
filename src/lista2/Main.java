package lista2;
import static java.lang.Math.abs;

class Main {

    public static long Factorial(int x){
        long factor=1;
        for(int i=2;i<=abs(x);i++){
            factor*=i;
        }
        return factor;
    }

    public static double Pow(double x,int k){
        if(k==0){
            return 1;
        }
        if(k%2==0){
            return Pow(x,k/2)*Pow(x,k/2);
        }
        else {
            return x*Pow(x,k-1);
        }
    }

    public static void main(String[] args){
        double x=35;
        int k=30;
        E calculateE = new E((int)x,k);
        Sin calculateSin = new Sin(x,k);
        Cos calculateCos = new Cos(x,k);
        System.out.println(calculateE.E_x_WK());
        System.out.println(calculateSin.Sin_x_WK());
        System.out.println(calculateCos.Cos_x_WK());
        System.out.println(Long.MAX_VALUE);
    }


}
