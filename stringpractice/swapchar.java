package stringpractice;

import java.util.Scanner;

public class swapchar {
	public static String swap(String str) {
		
		if(str==null || str.isEmpty()) {
			return str;
		}
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i+=2) {
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		
		System.out.print(swap(str));
		
	}
}
