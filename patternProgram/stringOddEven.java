package patternProgram;

import java.util.Arrays;

public class stringOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is a java language";
		//String[] result=new String[str.length()];
		String[] ans=str.split(" ");
		System.out.println("Even position:");
	    for(int i=0;i<ans.length;i=i+2) {
	    	System.out.println(i+":"+ans[i]);
	    }
	    System.out.println();
	    System.out.println("odd position:");
	    for(int i=1;i<ans.length;i=i+2) {
	    	System.out.println(i+":"+ans[i]);
	    }
		

	}

}
