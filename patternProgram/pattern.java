package patternProgram;

import java.util.Scanner;

public class pattern {
	
	static void print(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int s=1;s<=rows-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		print(rows);
	}
}
