package stringpractice;

import java.util.Scanner;

public class SortStringWithotMethod {
	
	public static void sort(String s) {
		boolean sorted=false;
		char[] ch=s.toCharArray();
		while(!sorted) {
			sorted=true;
	
		for(int i=0;i<ch.length-1;i++) {
			 
				if(ch[i]>ch[i+1]) {
				char temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
				sorted=false;
			}
		}
	
		}
		System.out.println(ch);
		
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		sort(str);
	}
}
