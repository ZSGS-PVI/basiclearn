package DemoOops;

//class Vehicle{
//	public void move() {
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	public void move() {
//		System.out.println("Bike moves!");
//	}
//	public void moves(int x) {
//		System.out.println("Bike moves at " + x + " km speed");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) {
//		Vehicle v=new Bike();
//		v.moves(12);
//	}
//}

//class Vehicle{
//	public void move() {
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	       void move() {
//		System.out.println("Bike moves!");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) {
//		Vehicle v=new Bike();
//		v.move();
//	}
//}

//class signedNumberException extends Exception{
//	
//}
//class UnsignedNumberException extends signedNumberException{
//	
//}
//class Vehicle{
//	 void move() throws signedNumberException{
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	 void move() throws UnsignedNumberException {
//		System.out.println("Bike moves!");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) throws Exception {
//		Vehicle v=new Bike();
//		v.move();
//	}
//}
//import java.io.FileNotFoundException;
//import java.io.IOException;
//class Vehicle{
//	 void move() throws IOException{
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	 void move() throws FileNotFoundException {
//		System.out.println("Bike moves!");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) throws Exception {
//		Vehicle v=new Bike();
//		v.move();
//	}
//}
//class Vehicle{
//	 Number move() {
//		return 12;
//	}
//}
//class Bike extends Vehicle{
//	 Double move() {
//		return 12.5;
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) throws Exception {
//		Vehicle v=new Bike();
//		System.out.println(v.move());
//	}
//}
//class Vehicle{
//	static void move() {
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	 void move()  {
//		System.out.println("Bike moves!");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) throws Exception {
//		Vehicle v=new Bike();
//		v.move();
//	}
//}
//class Vehicle{
//	static void move() {
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	 static void move()  {
//		System.out.println("Bike moves!");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) throws Exception {
//		Vehicle v=new Bike();
//		v.move();
//	}
//}class Vehicle{


//class Vehicle{
//	 void move() throws Exception{
//		System.out.println("Vehicle moves!");
//	}
//}
//class Bike extends Vehicle{
//	 void move()  {
//		System.out.println("Bike moves!");
//	}
//}
//public class OverrideDemo {
//	public static void main(String[] args) throws Exception{
//		Vehicle v=new Bike();
//		v.move();
//	}
//} must main method throws the super class excetion 
//
//
//
//    // Driver code
//    public static void main(String args[])
//    {
//        SuperClass s = new SubClass();
//        String str="kalpana";
//        System.out.println("length "+str.length());
//       // s.method();
//    }
//}