package stringpractice;

import java.util.Scanner;

public class Reverse {
	
	public static String reversestr(String str) {
	 String result="";
	 for(int i=str.length()-1;i>=0;i--) {
		 result+=str.charAt(i);
	 }
	 return result;
	}
	
	public static String reverse(String s) {
		StringBuilder result=new StringBuilder(s);
		 result.reverse();
		 return result.toString();
	}

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	
	System.out.println(reverse(str));
}
}
