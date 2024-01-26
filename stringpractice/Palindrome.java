package stringpractice;

import java.util.Scanner;

public class Palindrome {
	
	public static String check(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		return result.toString();
	}
	
	public static String builder(String str) {
		
		StringBuilder result=new StringBuilder(str);
		result.reverse();
		return result.toString();
		
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.next();
		String ans=builder(str);
		if(str.equals(ans)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
