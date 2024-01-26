package patternProgram;

import java.util.Scanner;

public class traiangle {
	
	public static void pattern(int rows) {
		int k=1;
		int a[][]=new int[rows][];
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(k++ +" ");
				
			}
		
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=in.nextInt();
		pattern(rows);
	}
	
}
