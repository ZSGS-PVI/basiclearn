package stringpractice;

public class replace {

	public static void main(String[] args) {
	
		String str="i love java";
	
		int index=2;
		char ch1='k';
		System.out.println("Before  changing:"+str);
	String result=str.substring(0,index)+ch1+str.substring(index+1);
	System.out.println("After  changing:"+result);
	
	StringBuilder s1=new StringBuilder(str);
	s1.setCharAt(index, ch1);
	System.out.println(s1);
	}
	

}
