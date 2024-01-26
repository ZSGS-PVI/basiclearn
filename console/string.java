package console;

import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
//	Scanner in =new Scanner(System.in);
//   
//    System.out.println("Enter the string:");
//    String word = in.nextLine();
//
//    String[] words = word.split(" ");
//
//    StringBuilder result = new StringBuilder();
//
//    for (String singleWord : words) {
//        if (!singleWord.isEmpty()) {
//       
//            char firstLetter = Character.toUpperCase(singleWord.charAt(0));
//           
//
//            result.append(firstLetter).append(singleWord.substring(1));
//        }
//    }
//
//    System.out.println(result.toString());
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String str=in.nextLine();
		String[] word=str.split(" ");
		StringBuilder result=new StringBuilder();
		
		
		
		for(String singleWord: word) {
			if(!singleWord.isEmpty()) {
				char firstLetter=Character.toUpperCase(singleWord.charAt(0));
				result.append(firstLetter).append(singleWord.substring(1));
			}
		}
		System.out.println(result.toString());

	}

}
