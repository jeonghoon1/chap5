package coperation;

public class Student {

	public String studentName;    // 학생명
	public int age;  // 나이
	public int money; // 금액
	
	public Student(String studentName, int money) {     // 이름과 가진 돈을 매개변수로 하는 생성자
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 버스를 타는 매서드
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
		System.out.println(studentName + "학생의 남은 돈은" + money + "원 입니다.");
	}
	
	
}
