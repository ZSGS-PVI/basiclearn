package zsgstestsecond;

import java.util.Scanner;


public class Question_2ArmstrongNumber {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int value=in.nextInt();
	int q=value;
	int count=0;
	int rem=0;
	while(q!=0) {
		
		q/=10;
		
		count++;
	}

	//power
	int n=value;
    int sum=0;
    
	while(n!=0) {
		int v=n%10;
		int mul=1;
		for(int i=0;i<count;i++) {
			mul*=v;
	}
//		sum+=Math.pow(v, count);
	sum+=mul;
	n/=10;
	}

	if(value==sum) {
		System.out.println(value+ " is an armstrong");
	}
	else {
		System.out.println("given number is not armstrong");
	}

	}

}
