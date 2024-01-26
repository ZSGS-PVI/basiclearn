package stringpractice;

// class modification{
//	
//	public  String insert(String originalStr,String newStr,int index)  {
//		
//		String result=new String();
//		for(int i=0;i<originalStr.length();i++) {
//			result+=originalStr.charAt(i);
//			if(i==index) {
//				result+=newStr;
//			}
//		}
//		return result;
//	}
//}

public class insertNewStr {
	 
	public static String insert(String oriStr,String newStr,int index) {
		
		
//	String	result=oriStr.substring(0,index+1)+newStr+oriStr.substring(index+1);
//		return result;
		
		StringBuffer str=new StringBuffer(oriStr);
		
		str.insert(index+1, newStr);
		return str.toString();
	}


	public static void main(String[] args) {
	
		String originalString="welcome to this java world";
		String newString="new world ";
		int index=7;
		System.out.println("before modification="+originalString);
		
		System.out.println("after modification= "+insert(originalString,newString,index));
//		modification change=new modification();
//		
//		System.out.println("After modification= "+change.insert(originalString,newString,index));
//
		
		}
}
