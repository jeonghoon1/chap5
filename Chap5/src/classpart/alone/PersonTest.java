package classpart.alone;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.age = 40;
		person.name = "James";
		person.marry = true;
		person.child = 3;
		
		System.out.println("???? :" + person.age);
		System.out.println("?̸? :" + person.name);
		System.out.println("??ȥ :" + person.marry);
		System.out.println("?ڳ? :" + person.child);
		
	}

}
