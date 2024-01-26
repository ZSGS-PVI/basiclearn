package patternProgram;

import java.util.Scanner;

public class AddMatrix {
	
	static int[][]  add(int A[][],int B[][],int n) {
		int[][] result=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=A[i][j]+B[i][j];
			}
		}
		return result;
	}
	
	static void print(int k[][],int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length:");
		int len=in.nextInt();
		
		System.out.println("Enter the firstarray:");
		int[][] firstarr=new int[len][len];
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
			firstarr[i][j]=in.nextInt();
		}
		}
		System.out.println("Enter the secondarray:");
		int[][] secondarr=new int[len][len];
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
			secondarr[i][j]=in.nextInt();
		}
		}
		
		int result[][]=add(firstarr,secondarr,len);
		print(result,len);
		
		

	}

}
