package classpart.method;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();    // new 필수   Student = 클래스형 student = 변수 new Student = new생성자
//		student.studentName = "최정훈" ;
		student.setStudentName("최정훈");
		System.out.println(student.getStudentName());
		
		Student student2 = new Student();
		student.setStudentName("홍길동");
		System.out.println(student.getStudentName());
		
		
		System.out.println(student);
		System.out.println(student2);
	}

}
