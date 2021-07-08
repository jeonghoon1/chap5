package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.studentname = "최정훈";
		std1.korea.setSubjectName("국어");
		std1.math.setSubjectName("수학");
		std1.korea.setSubjectScore(100);
		std1.math.setSubjectScore(100);
		std1.showStudentInfo();
		
		
		Student std2 = new Student(1111, "이루마");
		std2.setkorea("국어", 100);
		std2.setmath("수학", 90);
		std2.showStudentInfo();
	}

}
