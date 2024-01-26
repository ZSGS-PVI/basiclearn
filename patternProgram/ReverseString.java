package patternProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string:");
//		char[] chars=in.nextLine().toCharArray();
//	
//		for(int i=chars.length-1;i>=0;i--) {
//			System.out.print(chars[i]);
//		}
		String str=in.nextLine();
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		//System.out.println(result);
		//palindrome string
		if(str.toLowerCase().equals(result.toLowerCase())) {
			System.out.println("this string is a palindrome");
		}
		else {
			System.out.println("this string is not a palindrome");
		}

		

	}

}
