package arraylist_DS;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class patterntest2 {

//	
//
//		public static void main(String[] args) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter the input value");
//			int n = input.nextInt();
//			for(int i = 1 ; i <= n; i++) {
//				for(int j = 1; j <= n; j++) {
//					if(i == 1 || i == n || j == 1 || j == n) {
//						System.out.print("1");
//					}
//					else if(i%2 != 0 && j%2 != 0 ) {
//						System.out.print("1");
//					}
//					else {
//						System.out.print("0");
//					}
//
//				}
//				System.out.println();
//			}
//
//		}
	
	
		public static void main(String[] args) {
			int m = 6 ;
			int[] cost = {1,3,4,5,6};
			ArrayList<Integer> result = new ArrayList<Integer>();
			for(int i = 0; i< cost.length; i++) {
				for(int j = 0; j <cost.length; j++) {
					if(cost[i] + cost[j] == m) {
						result.add(i+1);
						result.add(j+1);
						break;
					}
				}
			}
			System.out.println(result);
		}

	}

	

