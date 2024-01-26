package arraylist_DS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class parent {
	

	public static void main(String[] args) {
		
	

		
		ArrayList<person> ll=new ArrayList<>();
		System.out.println("1.adduser \n 2.delete\n 3.update\n 4.display \n 5.exit");
		Scanner in=new Scanner(System.in);
		
		int  choice =in.nextInt();
		String name;
		int age;
		String email;
		int num;
		
		
			System.out.println("Enter the name");
			name=in.nextLine();
			in.nextLine();
			System.out.println("Enter the age");
			age=in.nextInt();
			in.nextLine();
			System.out.println("Enter the mail");
			email=in.nextLine();

			person person1=new person(name,age,email);
			ll.add(person1);
			  for (person person : ll) {
					System.out.println(person);
				  }
			
			
			
	
			
			System.out.println("Which object is used to remeove:");
			num=in.nextInt();
			ll.remove(num);
		
			
	
			System.out.println(" update:");
			
			person personvalue=ll.get(1);
			personvalue.setAge(23);
			personvalue.setName("abi");
			
	
		
		
		
		
			System.out.println(" display:");
		
	
		
		
		
		
		
	}
		}
		
//		
//	ll.remove(2);
//	System.out.println("After deleting the last person3");
//	
//	for (person person : ll) {
//		System.out.println(person);
//	}
//   
//	person personvalue=ll.get(1);
//	personvalue.setAge(23);
//	personvalue.setName("abi");
//		
//System.out.println("After updating the age in  the last person1");
//	
//	for (person person : ll) {
//		System.out.println(person);
//	}
		
   

	
	

class person{
	private	String name;
	private	int age;
	private	String email;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		public person(String name, int age, String email) {
		
			this.name = name;
			this.age = age;
			this.email = email;
		}
		@Override
		public String toString() {
			return "person [name=" + name + ", age=" + age + ", email=" + email + "]";
		}
		
		


	}
		
	