package patternProgram;

import java.util.Scanner;

public class TwoTriangle {

	
	public static void pattern(int rows) {
	
		for(int i=1;i<=rows;i++) {
			for(int s=1;s<=rows-i;s++) {
				System.out.print(1);
			}
			for(int j=1;j<=i;j++) {
			System.out.print(i);
				
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