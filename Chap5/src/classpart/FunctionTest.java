package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int sum = add(num1, num2); // 함수 호출, 결과값을 반환 받아 sum 변수에 대입.
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.println("1부터 10까지의 합 : "  +   getTotal());
	}   // main과 add가 서로 다른 영역이므로 같은 이름의 변수를 적어도 다르게 분류됨. ex) 메 num1 에 num1 같지않음.
	
	
	public static int getTotal( ) {
		int total = 0;
		for(int i = 1; i <=10; i++) {
			total += i;
		}
		return total;
	}
	
	
	public static int add(int n1, int n2) {  // 함수를 정의
		int result = n1 + n2;
		return result;
	}

}
