package classpart;

public class Student {
	// �л��� �Ӽ� : �������
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//�޼���(���)
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
}
	public static void main(String[] age) {
		Student std = new Student(); //�⺻ ������
		std.studentName = "��ü ������";
		std.address = "�λ�� ��� �ַʵ�";
		std.showStudentInfo();
		
	}
}
