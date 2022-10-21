
class Main{
	
	public static void main(String[] args) {
		double array[]= {3212,3,231312};
        Exercise21 zad2_1 = new Exercise21(1,2,1);  
        zad2_1.quadratic();
        System.out.println("\n");
        Exercise22 zad2_2 = new Exercise22(array);
        zad2_2.SortAscending();
        System.out.println("\n");
        Exercise23 zad2_3 = new Exercise23(-17,4);
        zad2_3.CalculateNWD();
    }
}
