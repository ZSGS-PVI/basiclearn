package DemoOops;

public class AccountHolder {

	public static void main(String[] args) {
		Bank bb=new Bank();
		//System.out.println(bb.minimumBalence);
		int mb=bb.getminimumBalence();
		System.out.println("your minimum balence is ="+mb);
		
		bb.setminimumBalence(1000);
		mb=bb.getminimumBalence();
		System.out.println("your minimum balence is ="+mb);
		

	}

}
