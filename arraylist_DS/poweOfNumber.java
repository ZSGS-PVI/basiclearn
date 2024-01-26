import java.util.Arrays;
import java.util.Scanner;

public class poweOfNumber {
    public static int sumof(int n) {
        int ans=0;
        while(n!=0) {
            int rem=n%10;
            ans+=rem;
            n/=10;
        }
        //System.out.println("ans="+ans);
        return ans;
    }
    
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
  
    int base=2;
    int n=in.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
    int power=in.nextInt();
    
    int result=1;
    while(power!=0) {
        result =result*base;
        power--;
    }
   int sumof = sumof(result);  
   arr[i]=sumof;
    }
    for (int i = 0; i < arr.length; i++) {
    	System.out.println((arr[i]));
	}
     
}  
}


