package reference.test;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	// 디폴트 생성자
	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
		
	}

	// 학번과 이름을 매개변수로 갖는 생성자
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("국어");
		math = new Subject("수학");
		
	}
	
	public void setkorea(int score) {
		korea.subjectScore = score;
	
	}
	public void setmath(int score) {
		math.subjectScore = score;
	
	}
	public void printStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "학생의" + korea.subjectName + "과목의" + "점수는" + korea.getSubjectScore() + "점 " + math.subjectName + "과목의" + "점수는" + math.subjectScore + "점, 총점은" + total + " 점입니다.");
	}
}
