package arraylist_DS;

import java.util.Scanner;

public class ConvertDigitToString {
	private static final String[] ones= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	private static final String[] teens= {"Eleven","Twelve","Thirteen","Fourteen","Fifeteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	private static final String[] tens= {"","","Twenty","Tirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	
	static String convertToWords(int num) {
		if(num<0) {
			return "minus "+convertToWords(-num);
		}
		
		else if(num<10) {
			return ones[num];
		}
		else if(num<20) {
			return teens[num-11];
		}
		else if(num<100) {
			return tens[num/10]+((num%10!=0?" "+ones[num%10]: ""));
		}
		else if(num<1000) {
			return ones[num/100]+" Hundred"+((num%100!=0) ? "and"+convertToWords(num%100):"");
		}
		else if(num<1000000) {
			return ones[num/1000]+" Thousand"+((num%1000!=0) ? " "+convertToWords(num%1000):"");
		}
		return null;
	}
	public static void main(String[] args) {
	
  Scanner in=new Scanner(System.in);
int val=in.nextInt();
 String str= convertToWords(val);
 System.out.println(str);



  

	}

}
