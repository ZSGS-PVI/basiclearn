package Assessment;
import java.util.Scanner;
public class NearestNumber {
	
	public static int abs(int num) {
        return num >= 0 ? num : -num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = in.nextInt();
        
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / len;

        int nearest = arr[0];
        int minDiff = abs((int) (average - arr[0]));

        for (int i = 1; i < len; i++) {
            int diff = abs((int) (average - arr[i])); 
            if (diff < minDiff) {
                minDiff = diff;
                nearest = arr[i];
            }
        }
        
      
        System.out.println("The Element is: " + nearest);
    }
}
