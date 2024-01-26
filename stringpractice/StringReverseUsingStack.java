package stringpractice;

import java.util.Stack;

public class StringReverseUsingStack {

	public static void main(String[] args) {
		Stack<Character> stack=new Stack<>();
		 String str="java";
		 for(int i=0;i<str.length();i++) {
			 stack.push(str.charAt(i));
		 }
		 
		 String result="";
		 while(!stack.isEmpty()) {
		 for(int i=0;i<str.length();i++) {
			 result+=stack.pop();
		 }
		 }
		 System.out.println(result);
	}
}
