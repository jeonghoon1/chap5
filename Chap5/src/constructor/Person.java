package constructor;

public class Person {

	String Name;
	float height;
	float weight;
	
	 public Person() { } // ����Ʈ ������, �ϳ��� �����ڵ� ���� ��� �����Ϸ��� �ڵ��Ƿ� ����.
	
	public Person (String pname ) {
		Name = pname;
		
	}
	public Person (String pname , float pheight, float pweight) {
		Name = pname;
		height = pheight;
		weight = pweight;
	}
}
