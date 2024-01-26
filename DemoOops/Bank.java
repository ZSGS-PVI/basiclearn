package DemoOops;

public class Bank {

private	int minimumBalence=2500;

 public int getminimumBalence() {
	 return this.minimumBalence;
 }
 
 public void setminimumBalence(int value) {
	 
	 if(value>=2500) {
		 this.minimumBalence=value;
	 }
	 else {
		 System.out.println("your are under the minimum Balence Checking the current account!");
	 }
 }
	
	
}
