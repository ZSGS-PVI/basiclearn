package Assessment;

import java.util.Scanner;

public class MismatchChar {
	
	public static int findlen(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string1 = "abcdefeghijklm";
        String string2 = "abcduabihijkim";
        StringBuilder result = new StringBuilder();

        int length1 = findlen(string1);
        int length2 = findlen(string2);
     
        for (int i = 0; i < length1; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                result.append(string1.charAt(i));
                result.append(string2.charAt(i));
            }
        }


        System.out.println("Result: " + result);
    }
}