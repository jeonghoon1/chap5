package classpart.method;

public class Student {
	int student;
	String studentName;
	int grade;
	String address;
	
	
	public String getStudentName() {   // 이름을 얻기 위한 메서드
		return studentName;
	}
	
	public void setStudentName(String name) {     // 이름을 지정하는 메서드
		studentName = name;
	//	return;   마지막 return은 생략가능
		
	}
}
