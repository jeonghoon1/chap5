package thisexam;

public class Person {

	String name;
	int age;
    
	// ����Ʈ ������
	public Person () {
		// �ν��Ͻ� ������ �ʱ�ȭ�� �۾��� ����.
		// name = " " ;  // ������ �ν��Ͻ��� ��� ������ ������ �Ǳ� ������ ���ɼ��� �����Ƿ� (����)
		  // name = "����" ; 
	    // 	age = 1;
		// ������ ���ο� �� �ٸ� �����ڸ� ȣ���Ͽ� ��� ������ �ʱ�ȭ
		this("�̴��� ����ŷ" , 99999);   // �ݵ�� ù ��° �ٿ� ����ؾ� ������ ���Ѵ�.
	}
	
	public Person(String name, int age) {       // �Ű����� ������  �ʱ�ȭ�� ��� ������ �Ű������� �����ϴ� ������
		this.name = name;
		this.age = age;
	
	}
	
	public Person returnSelf() {
		return this;       // this ���� ���� �ڽ��� �ν��Ͻ� Ÿ������ ����
	}
}
