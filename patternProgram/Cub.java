package patternProgram;



	interface Tigerable{
		int x=5;
	}
	public class Cub implements Tigerable  {
		int x;
		void display()
		{
			x=3;
			System.out.println(x);
		}
		public static void main(String[] args) {
			Cub c=new Cub();
			c.display();
		}
	}
	

	    


