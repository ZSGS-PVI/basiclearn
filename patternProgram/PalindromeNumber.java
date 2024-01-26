package patternProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=in.nextInt();
		int q=number;
		int rem;
		int result=0;
		while(q!=0) {
			rem=q%10;
			result=result*10+rem;
			q/=10;
		}
		System.out.println(result);
//		if(result==number) {
//			System.out.println(number+" is a palindrome");
//		}
//		else {
//			System.out.println(number+" is not a palindrome");
//		}

	}

}
