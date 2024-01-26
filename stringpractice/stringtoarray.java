package stringpractice;

public class stringtoarray {

	public static void main(String[] args) {
		String str="this is java world under the sun";
	     String[] s=str.split(" ");
	     System.out.print("[");
	     for(String sa:s) {
	    	 System.out.print(sa+"," );
	     }
	     System.out.print("]");
	}
}
