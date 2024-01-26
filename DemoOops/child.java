package DemoOops;

public class child extends inheritanceParent{
	
	public static void main(String[] args) {
		
		child ch=new child();
		ch.read();
		ch.play();
		ch.work();
		ch.travel();
	}
	
	public void read() {
		System.out.println("i am reading in child class");
	}
	
	public void play() {
		System.out.println("i am playing in child class");
	}

}
