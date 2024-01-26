package patternProgram;

import java.util.Scanner;

public class pattern1231 {
	static void print(int rows) {
		int num=1;
		for(int i=1;i<=rows;i++) {
		
			for(int j=i;j>0;j--) {
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
