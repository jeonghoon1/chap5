package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.studentname = "������";
		std1.korea.setSubjectName("����");
		std1.math.setSubjectName("����");
		std1.korea.setSubjectScore(100);
		std1.math.setSubjectScore(100);
		std1.showStudentInfo();
		
		
		Student std2 = new Student(1111, "�̷縶");
		std2.setkorea("����", 100);
		std2.setmath("����", 90);
		std2.showStudentInfo();
	}

}
