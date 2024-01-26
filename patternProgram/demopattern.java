package patternProgram;

import java.util.Scanner;

public class demopattern {
	public static void main(String args[]) {
		System.out.println("Enter the rows:");
		Scanner in=new Scanner(System.in);
		int rows=in.nextInt();
       
  
        for (int i = 1; i<=rows; i++) {
            for (int s = 1; s<=i-1; s++) {
                System.out.print(" ");
            }
            int num = i;
            for (int j = 1; j <= rows-i+1; j++) {
                System.out.print(num);
                num = 1 + rows * 2 - j;
            }

            System.out.println();
        }
    } 
}
