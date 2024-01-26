package DemoOops;
public class array{
//public static  boolean checking() {
//String first = new String("InterviewBit");
//String second = new String("InterviewBit");
//if (first == second)
// return true;
//else
// return false;
//}
//public static void main(String[] args) {
//	
//System.out.println(checking());
//}
	
	
//	String a="kirthi";
//	public array() {
//		a=a+"hello";
//	}
	   public static String  concat(String s1)
	    {
	        s1 = s1 + "forgeeks";
	        return s1;
	    }
	public static void main(String[] args) {
		//1System.out.println(new array().a);
		
		String a="kirthi";
		String k=concat(a);
		System.out.println(a +" "+k);
	}
}
	
	
//int[][] a= {
//		{1,2,3},
//		{4,5,6} };
//               
//
//for(int i=0;i<a.length;i++) {
//	for(int j=o;j<a[i].length;j++) {
//		System.out.println(a[i][j]);
//	}
//}
	
//	public static void concat1(String s1)
//    {
//        s1 = s1 + "forgeeks";
//    }
// 
//    // Method 2
//    // Concatenates to StringBuilder
//    public static void concat2(StringBuilder s2)
//    {
//        s2.append("forgeeks");
//    }
// 
//    // Method 3
//    // Concatenates to StringBuffer
//    public static void concat3(StringBuffer s3)
//    {
//        s3.append("forgeeks");
//    }
 
    // Method 4
    // Main driver method
//    public static void main(String[] args)
//    {
//        // Custom input string
//        // String 1
//        String s1 = "Geeks";
// 
//        // Calling above defined method
//        concat1(s1);
// 
//        // s1 is not changed
//        System.out.println("String: " + s1);
// 
//        // String 1
//        StringBuilder s2 = new StringBuilder("Geeks");
// 
//        // Calling above defined method
//        concat2(s2);
// 
//        // s2 is changed
//        System.out.println("StringBuilder: " + s2);
// 
//        // String 3
//        StringBuffer s3 = new StringBuffer("Geeks");
// 
//        // Calling above defined method
//        concat3(s3);
// 
//        // s3 is changed
//        System.out.println("StringBuffer: " + s3);
//    }
//}

