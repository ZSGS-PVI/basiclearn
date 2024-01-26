package console;

class Bike{
	private int price;
	private String name;

	public Bike() {
		
		this.price = 0;
		
	}

	public Bike(int price) {
		
		this.price = price;
		
	}
	
	public Bike( String name,int price) {
		
		this.price = price;
		this.name = name;
	}
	public int getPrince() {
		return price;
	}
	public void setPrince(int prince) {
		this.price = prince;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String display() {
		return "price="+price+" "+"name="+name;
	}
	
}

public class overloading {

	public static void main(String[] args) {
		Bike bike1=new Bike();
		Bike bike2=new Bike();
		Bike bike3=new Bike();
//		System.out.println(bike1.display());
//		System.out.println(bike2.display());
//		System.out.println(bike3.display());
		
		
		bike3.setName("Activa");
		bike3.setPrince(90000);
		System.out.println(bike2.getPrince());
		System.out.println(bike3.getName());
		System.out.println(bike3.getPrince());
		
	
		

	}

}
