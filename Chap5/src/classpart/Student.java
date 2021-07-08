package classpart;

public class Student {
	// 학생의 속성 : 멤버변수
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//메서드(기능)
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
}
	public static void main(String[] age) {
		Student std = new Student(); //기본 생성자
		std.studentName = "하체 조지자";
		std.address = "부산시 사상구 주례동";
		std.showStudentInfo();
		
	}
}
