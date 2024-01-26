package patternProgram;

import java.util.Scanner;

public class LargestElement {
	
	static int largest(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
    Scanner in=new Scanner(System.in);
    System.out.println("enter the length:");
    int len=in.nextInt();
    int[] array=new int[len];
    for(int i=0;i<len;i++) {
    	array[i]=in.nextInt();
    }
   System.out.println( "The largest element in the array is:"+largest(array));

	}

}
