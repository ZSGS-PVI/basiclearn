package DemoOops;

public class encapsulation {
	
	String name;
	int price;
	
	
	

	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) {
		
		encapsulation en=new encapsulation();
		en.setName("kalpana");
		en.setPrice(1200);
		
		System.out.println("name="+en.getName());
		System.out.println("price="+en.getPrice());

	}

}
