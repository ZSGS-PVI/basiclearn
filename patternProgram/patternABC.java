package patternProgram;

import java.util.Scanner;

public class patternABC {
	static void print(int rows) {
		
		for(int i=1;i<=rows;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				
				System.out.print(ch);
				ch++;
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
