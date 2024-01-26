package stringpractice;

public class EvenlengthString {

	public static void main(String[] args) {
		String str="i am gfg";
		String[] s=str.split(" ");
	for(int i=0;i<s.length;i++) {
		if(s[i].length()%2==0) {
			System.out.println(s[i]);
		}
	}

	}

}
