package Assessment;

import java.util.Scanner;

public class PowOfArray {
	
    public static int powerOf(int val, int pow) {
        int result = 1;
        while (pow > 0) {
            result *= val;
            pow--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = in.nextInt();
        System.out.println("Enter the power:");
        int pow = in.nextInt();
        System.out.println("Array of elements:");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Powers of array elements:");
        int[] result=new int[len];
        System.out.print("[");
        for (int i = 0; i < len; i++) {
             result[i] = powerOf(arr[i], pow);
            System.out.print(result[i]);
            if (i != len - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
