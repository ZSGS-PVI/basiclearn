package Conditional;

//class A
//{
//	A(String s){
//		System.out.print("A");
//	}
//}
//public class Over extends A {
//	Over(String s) {
//		System.out.print("O");
//}
//public static void main(String[] args) {
//		new Over("B");
//	}
//}it not have a default construcor in A class
//
//class A
//{
//	A(String s){
//		System.out.print("A");
//	}
//}
//public class Over extends A {
//	Over(String s) {
//              super(s);
//		System.out.print("O");
//}
//public static void main(String[] args) {
//		new Over("B");
//	}
//}
//public class Over{
//	float add(int a, float b) {
//		return (a+b);
//	}
//	float add(float a, int b) {
//		return (a+b);
//	}
// public static void main(String[] args) {
//		System.out.println(new Over().add(12.3, 14));
//	}
//}
//
//public class Over{
//	Double add(Double a, float b) {
//		System.out.print("A");
//		return (a+b);
//	}
//	float add(Double a, int b) {
//		System.out.print("B");
//		return (float)(a+b);
//	}
//	int add(Double a, int b) {
//		System.out.print("C");
//		return (int)(a+b);
//	}
// public static void main(String[] args) {
//		System.out.println(new Over().add(12.3, 14));
//	}
//}

//public class Over{
//	Double add(Double a, float b) {
//		System.out.print("A");
//		return (a+b);
//	}
//	float add(Double a, long b) {
//		System.out.print("B");
//		return (float)(a+b);
//	}
//	int add(Double a, int b) {//auto boxing
//		System.out.print("C");
//		return (int)(a+b);// unboxing
//	}
// public static void main(String[] args) {
//		System.out.println(new Over().add(12.3, 14));
//	}
//}

//public class Over{
//	Double add(Double a, float b) {
//		System.out.print("A");
//		return (a+b);
//	}
//	float add(Double a, long b) {
//		System.out.print("B");
//		return (float)(a+b);
//	}
//	int add(Double a, Double b) {
//		System.out.print("C");
//		return (int)(a+b);
//	}
// public static void main(String[] args) {
//		System.out.println(new Over().add(12.3, 14));
//	}
//}
//
//class A{
//	float spit(float a) {
//		System.out.print("A");
//		return a;
//	}
//}
//public class Over extends A{
//	float spit(float a) {
//		System.out.print("F");
//		return a;
//	}
//	int spit(int a) {//not a overrided method subclass of overloaded  method
//		System.out.print("L");
//		return a;
//	}
// public static void main(String[] args) {
//	   A a=new Over();
//		System.out.println(a.spit(12));
//	}
//}

public class Over {
	void add(int a,Object b)
	{System.out.println("Object");}
	
	void add(Object a,double b)
	{ System.out.println("Double");}
	
 public static void main(String[] args) {
	   Over a=new Over();
//	   a.add(12,3.5);
	}
}