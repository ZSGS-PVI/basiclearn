package DemoOops;

import java.util.Scanner;

public class demo {

//	public static  boolean checking() {
//		String first = "InterviewBit";
//		String second = "InterviewBit";
//		if (first==second)
//		 return true;
//		else
//		 return false;
//		}
//		public static void main(String[] args) {
//			
//		
//		System.out.println(checking());
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=in.nextInt();
		 }
		 
		 for(int i=0;i<5;i++) {
			 System.out.print(a[i]+" ");
		 }
		 
	}
		}
		
		
		
		