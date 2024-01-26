package testsecond;

import java.util.Scanner;

public class TransposeMstrix_2 {
	
	public static int[][] Transpose(int A[][],int n){
		int[][] result=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=A[j][i];
			}
		}
		return result;
		
	}
	
	static void print(int k[][],int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				 
				System.out.print(k[i][j]);
				if (j < k[i].length - 1) {
                    System.out.print(", ");
                }
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int len=in.nextInt();
		int[][] arrayA=new int[len][len];
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				arrayA[i][j]=in.nextInt();
			}
		}
		System.out.println("Before Transpose:");
		print(arrayA,len);
		int[][] result=Transpose(arrayA,len);
		System.out.println("After Transpose:");
		print(result,len);
	}
	

}



