package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();   // ����Ʈ ������ : Ŭ���� �̸��� ���� �Ű������� ������ ��ȯ ���� ���� Ư���� ������ �Լ�
		
		System.out.println(person);
		person.Name = "������" ;
		person.height =  170 ;
		person.weight = 60 ; 
		System.out.println(person.Name +"���� Ű��" + person.height +"�̰�"+ "�����Դ�" + person.weight + "�Դϴ�.");
		
		Person personLee = new Person("�̷縶" , 150, 65) ;
		System.out.println(personLee.Name +"���� Ű��" + personLee.height +"�̰�"+ "�����Դ�" + personLee.weight + "�Դϴ�.");
	}

}
