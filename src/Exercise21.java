import static java.lang.Math.sqrt;

public class Exercise21 {
	
	private double a,b,c;
	
	public Exercise21(double a,double b, double c) {
        this.a =a;
        this.b =b;
        this.c =c;
    }
	
	private static void linear(double a, double b){ //ax+b
        double x;
        if(a==0) {
            if (b == 0) {
                System.out.println("Identity equation");
            } else {
                System.out.println("Contradicting equation");
            }
        }
        else{
            x=-b/a;
            System.out.println("Linear equation, x ="+x);
        }
    }

    public void quadratic() { //ax^2+bx+c
        double x1,x2;
        if(a==0){
            linear(b,c);
        }
        else{
            double delta;
            delta=b*b-4*a*c;
            if(delta<0){
                System.out.println("No answers");
            }
            if(delta==0) {
                x1=-b/(2*a);
                System.out.println("Quadratic equation with only one answer, x ="+x1);
            }
            if(delta>0){
                x1=(-b+sqrt(delta))/(2*a);
                x2=(-b-sqrt(delta))/(2*a);
                System.out.println("Two answers:\n x1 ="+x1+"\n x2 ="+x2);
            }
        }

    }
}
