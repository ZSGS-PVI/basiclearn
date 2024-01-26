package stringpractice;

import java.nio.charset.Charset;
import java.util.Scanner;

public class StringToInputStream {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.next();
	
	System.out.println("String:"+str);
	
	InputStream stream=new ByteArrayInputStream(String.getBytes(Charset.forName("UTF-8")));
	
	BufferReader result=new BufferReader(stream);

	}

}
