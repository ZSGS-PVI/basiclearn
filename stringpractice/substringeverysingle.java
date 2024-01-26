package stringpractice;

import java.util.ArrayList;

public class substringeverysingle {
	
	public static ArrayList<String>SplitSubStrings(String s){
		
		int len=s.length();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<=len;j++) {
				al.add(s.substring(i,j));
			}
		}
		return al;
		
	}

	public static void main(String[] args) {
		String str=new String("the dog");
		ArrayList<String> subStringList= substringeverysingle.SplitSubStrings(str);
		int count=1;
		for(String it:subStringList) {
			System.out.println("("+count+") \""+ it +"\"");
			count++;
		}
	}
}
 