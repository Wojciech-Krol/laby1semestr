package lista1;

public class Exercise22 {
	
	private double[] array;
	
	public Exercise22(double array[]) {
		this.array=array;
	}
	
    private void bubbleSort(double array[]){
        int n=array.length;
        double temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    private void printNumbersInAscendingOrder(double array[]){
        for(int i=0;i<3;i++){
            System.out.println(array[i]+"\n");
        }
    }

    public void SortAscending(){
        bubbleSort(array);
        printNumbersInAscendingOrder(array);
    }
}
