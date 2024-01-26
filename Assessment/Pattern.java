package Assessment;

import java.util.Scanner;

public class Pattern {

	   public static void main(String[] args) {
		   
			    Scanner scanner = new Scanner(System.in);
			    System.out.println("Enter the value of n:");
			    int n = scanner.nextInt();

			    for (int i = 0; i < 2 * n - 1; i++) {
			        for (int j = 0; j < 2 * n - 1; j++) {
			           
			            int val = Math.min(Math.min(i, 2 * n - 2 - i), Math.min(j, 2 * n - 2 - j)) == 0 ? n : n - Math.min(Math.min(i, 2 * n - 2 - i), Math.min(j, 2 * n - 2 - j));
			            System.out.print(val + " ");
			        }
			        System.out.println();
			    }
		   }
}
	   