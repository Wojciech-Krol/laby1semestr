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
        double x=150;
        int k=8;
        System.out.println(Pow(2,1000));
        E calculateE = new E((int)3,k);
        Sin calculateSin = new Sin(x,k);
        Cos calculateCos = new Cos(x,k);
        System.out.println("Wartości z zad4:");
        System.out.println("Wartość e^"+3+"= "+calculateE.E_x_WK_zad4());
        System.out.println("Wartość sin("+x+")= "+calculateSin.Sin_x_WK_zad4());
        System.out.println("Wartość cos("+x+")= "+calculateCos.Cos_x_WK_zad4());
        System.out.println("Wartości z zad3:");
        System.out.println("Wartość e^"+3+"= "+calculateE.E_x_WK_zad3());
        System.out.println("Wartość sin("+x+")= "+calculateSin.Sin_x_WK_zad3());
        System.out.println("Wartość cos("+x+")= "+calculateCos.Cos_x_WK_zad3());
    }

}
