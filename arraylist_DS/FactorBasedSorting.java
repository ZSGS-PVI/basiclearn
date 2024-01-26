package arraylist_DS;

public class FactorBasedSorting {

	public static void main(String[] args) {
		int[] numbers= {8,2,3,12,16};
		
		compute(numbers);
		for(int number:numbers) {
			System.out.print(number+" ");
		}

	}
	static void compute(int[] values) {
		for(int i=0;i<values.length-1;i++) {
			for(int j=0;j<values.length-i-1;j++) {
				if(factor(values[j])<factor(values[j+1])) {
					int temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
				}
			}
		}
	}
	
	static int factor(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	

}
