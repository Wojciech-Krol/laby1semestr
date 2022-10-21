import static java.lang.Math.abs;

public class Exercise23 {
    private int a,b;
    
    public Exercise23(int a, int b) {
    	this.a=a;
    	this.b=b;
    }
    
    public void CalculateNWD() {	
    	System.out.println(NWD(a,b));
    }
    
    private int NWD(int a, int b){
		a=abs(a);
		b=abs(b);
        if (b == 0){
            return a;
        }
        else{
            return NWD(b,a%b);
        }
    }
}
