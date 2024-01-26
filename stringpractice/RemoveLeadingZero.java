package stringpractice;

public class RemoveLeadingZero {
	
//	
//	public static String removeZero(String s) {
//		int i=0;
//		
//		while(i<s.length() && s.charAt(i)=='0') 
//			i++;
//		StringBuffer result=new StringBuffer(s);
//			result.replace(0,i,"");
//			
//		
//		return result.toString();
//	}
	
	public static void without(String k) {
		int ind=0;
		String news="";
		for(int i=0;i<k.length();i++) {
			char ch=k.charAt(i);
			if(ch!='0') {
				ind=i;
				break;
			}
		}
		news=k.substring(ind,k.length());
		System.out.println(news);
	}
public static void main(String[] args) {
	String str="0000001234450860";
	//str=removeZero(str);
	without(str);
	//System.out.println("result:"+str);
}
}
