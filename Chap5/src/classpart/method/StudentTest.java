package classpart.method;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();    // new �ʼ�   Student = Ŭ������ student = ���� new Student = new������
//		student.studentName = "������" ;
		student.setStudentName("������");
		System.out.println(student.getStudentName());
		
		Student student2 = new Student();
		student.setStudentName("ȫ�浿");
		System.out.println(student.getStudentName());
		
		
		System.out.println(student);
		System.out.println(student2);
	}

}
