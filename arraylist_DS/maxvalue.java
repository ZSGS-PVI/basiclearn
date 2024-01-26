package arraylist_DS;

import java.util.Arrays;

public class maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {56,87,90,23,80};
		
		System.out.println(max(arr));
		
		
		

	}
	
	
	public static int max(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
