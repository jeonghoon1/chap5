package classpart.alone;

public class FunctionTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		
		int sum = add2(a, b);
		int sum2 = add3(a, b);
		int sum3 = add4(a,b);
		double sum4 = add5(a,b);
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sum2);
		System.out.println(a + " * " + b + " = " + sum3);
		System.out.println(a + " / " + b + " = " + sum4);
		
		
		
	}

	public static int add2(int a , int b) {
		return	a + b;
	}
	public static int add3(int a , int b) {
		return	a - b;
	}	
	public static int add4(int a , int b) {
		return	a * b;
	}
	public static double add5(double a , double b) {
		return	a / b;
	}
}

