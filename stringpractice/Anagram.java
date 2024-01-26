package stringpractice;

import java.util.Arrays;

public class Anagram {
	
	public static boolean check(char[] s1,char[] s2) {
		int n1=s1.length;
		int n2=s2.length;
		
		if(n1!=n2) {
			return false;
		}
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<n1;i++) {
			if(s1[i]!=s2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[] str1= {'l','i','s','t','e','n'};
		char[] str2= {'s','i','l','e','n','t'};
		
		if(check(str1,str2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
