package stringpractice;

public class RemoveVowels {

	public static void main(String[] args) {
		String str="GeekAsforgeeksIOU";

		
		String vowvel="aeiouAEIOU";
		
		for(int i=0;i<str.length();i++) {
			char  currentletter=str.charAt(i);
			char lowercase=Character.toLowerCase(currentletter);
			if(vowvel.indexOf(lowercase)==-1) {
				System.out.print(currentletter);
			}
			
			
		}

	}

}
//
//char[]  ch=str.toCharArray();
//int j=0;
//for(int i=0;i<str.length();i++) {
//	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
//		continue;
//	}
//	else {
//		System.out.print(str.charAt(i));
//	}
//}