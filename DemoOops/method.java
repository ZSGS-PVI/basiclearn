package DemoOops;
import java.io.FileNotFoundException;
class ValueException extends Exception{}
public class method {
	protected void eat(int a) throws ArithmeticException
	{System.out.println("Throws runtime exception");}
	
	private void eat(double b) throws ValueException
	{ System.out.println("Throws new checked exception");}
	
	protected void eat(Object o) throws FileNotFoundException
	{ System.out.println("Throws new non runtime exception");}
	
	public void eat(float o) throws Exception
	{ System.out.println("Throws a broader exception");}
	
	public static void main(String[] args) throws Exception {
		method m=new method();
		m.eat(7.5);
	}
}
