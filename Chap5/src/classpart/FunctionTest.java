package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int sum = add(num1, num2); // �Լ� ȣ��, ������� ��ȯ �޾� sum ������ ����.
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.println("1���� 10������ �� : "  +   getTotal());
	}   // main�� add�� ���� �ٸ� �����̹Ƿ� ���� �̸��� ������ ��� �ٸ��� �з���. ex) �� num1 �� num1 ��������.
	
	
	public static int getTotal( ) {
		int total = 0;
		for(int i = 1; i <=10; i++) {
			total += i;
		}
		return total;
	}
	
	
	public static int add(int n1, int n2) {  // �Լ��� ����
		int result = n1 + n2;
		return result;
	}

}
