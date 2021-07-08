package reference;

public class Student {

	int studentid;
	String studentname;
	//String koreasubject;
	//int koreascre;
	//String
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
		
	}
	
	public Student(int id, String name) {
		studentid = id;
		studentname = name;
		korea = new Subject();
		math = new Subject();
		
	}
	

	public void setkorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setSubjectScore(score);
		
}
	
	public void setmath(String name, int score) {
		math.setSubjectName(name);
		math.setSubjectScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentname + "학생의 국어 점수는" + korea.getSubjectScore() + "점, 수학 점수는" + math.getSubjectScore() + " 점, 총점은" + total + "점 입니다.");
	}
}
