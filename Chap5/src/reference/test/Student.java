package reference.test;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	// ����Ʈ ������
	public Student() {
		korea = new Subject("����");
		math = new Subject("����");
		
	}

	// �й��� �̸��� �Ű������� ���� ������
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("����");
		math = new Subject("����");
		
	}
	
	public void setkorea(int score) {
		korea.subjectScore = score;
	
	}
	public void setmath(int score) {
		math.subjectScore = score;
	
	}
	public void printStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "�л���" + korea.subjectName + "������" + "������" + korea.getSubjectScore() + "�� " + math.subjectName + "������" + "������" + math.subjectScore + "��, ������" + total + " ���Դϴ�.");
	}
}
