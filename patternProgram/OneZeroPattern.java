package patternProgram;

import java.util.Scanner;

public class OneZeroPattern {
	public static void pattern(int rows) {
		
	
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
		
			if(j%2!=0) {
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
				
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