package reference.test;

public class StudnetTest {

	public static void main(String[] arge) {
		Student std1 = new Student ();
		std1.studentName = "ÃÖÁ¤ÈÆ";
		std1.setkorea(100);
		std1.setmath(100);
		std1.printStudentInfo();
		
		Student std2 = new Student(20161461, "È«±æ¼ø");
		std2.setkorea(60);
		std2.setmath(80);
		std2.printStudentInfo();
	}
}
