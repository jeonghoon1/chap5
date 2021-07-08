package constructor;

public class Person {

	String Name;
	float height;
	float weight;
	
	 public Person() { } // 디폴트 생성자, 하나의 생성자도 없는 경우 컴파일러가 자동의로 생성.
	
	public Person (String pname ) {
		Name = pname;
		
	}
	public Person (String pname , float pheight, float pweight) {
		Name = pname;
		height = pheight;
		weight = pweight;
	}
}
