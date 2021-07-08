package coperation;

public class Student {

	public String studentName;    // �л���
	public int age;  // ����
	public int money; // �ݾ�
	
	public Student(String studentName, int money) {     // �̸��� ���� ���� �Ű������� �ϴ� ������
		this.studentName = studentName;
		this.money = money;
	}
	
	// �л��� ������ Ÿ�� �ż���
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway subway) {
		this.money -= 1500;
		subway.take(1500);
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
	}
	public void printStudentInfo() {
		System.out.println(studentName + "�л��� ���� ����" + money + "�� �Դϴ�.");
	}
	
	
}
