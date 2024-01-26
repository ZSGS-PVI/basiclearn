package StringMethods;

public class addchar {

	public static void main(String[] args) {
		String s1="kalpana";
		String s2="devi";
		int index=3;
		
		System.out.println(s1+" "+s2);

		System.out.println(s2+" "+s1);
		
		StringBuilder s=new StringBuilder(s1);
		
		s=s1.substring(0,index+1)+s1.substring(s2)+s1.substring(index)+1;
}
}
