package patternProgram;

import java.util.Scanner;

public class factorial {
	
	static int fact(int n) {
//		
//		if(n==0) {
//			return 1;
//		}
//		return n*fact(n-1);
//	}
		int k=1;
//	
		for(int i=1;i<=n;i++) {
			k=k*i;
		}
		return k;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=in.nextInt();
		System.out.println(fact(number));

	}

}
