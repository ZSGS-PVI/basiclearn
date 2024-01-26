package console;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {
	
	public static void reverse(String str) {
		
		String str1=" ";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		
System.out.println(str1);

	}
	
	public static void palindrome(String str) {
		StringBuilder name=new StringBuilder(str);
	    name.reverse();
	
		if(name.equals(str)) {
			
			System.out.println(str+"the given string is palindrome");
		}
		else {
			System.out.println(str+"not a palindrome");
		}
	}
	
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		

		
		System.out.println("1.Reverse\n 2.palindrome\n 3.chechstr  ");
		System.out.println("Enter the string");
		String str=in.nextLine();
		int choice=in.nextInt();
		switch(choice) {
		case 1:
			reverse(str);
			break;
		case 2:
			palindrome(str);
			break;
		case 3:
			ArrayList<String> names=new ArrayList<>();
			names.add("one");
			names.add("two");
			names.add("three");
			boolean s=names.contains("three");
			System.out.println(s);
			
		}

	}

}
