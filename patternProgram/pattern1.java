package patternProgram;

import java.util.Scanner;

public class pattern1 {
	
	
	public static void patternTriangle(int rows,char symbol) {
		for(int i=1;i<=rows;i++) {
			for(int space=rows-i;space>=1;space--) {
				System.out.println(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(symbol);
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void patternReverse(int rows,char symbol) {
		
		for(int i=rows;i>=1;i--) {
	
			for(int j=1;j<=i;j++) {
				System.out.print(symbol);
			}
			
			System.out.println();
		}
		
	}
	public static void pattern1(int rows,char symbol) {
	
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==1 || j==1) {
					System.out.print(symbol);
				}
				System.out.println(" ");
			}
		}
	}
	
	   
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
	    System.out.println("Enter the char:");
	    char symbol=in.next().charAt(0);
	    
	    //patternTriangle(rows,symbol);
	    
	    //patternReverse(rows,symbol);
	    pattern1(rows,symbol);
	
	}
}
