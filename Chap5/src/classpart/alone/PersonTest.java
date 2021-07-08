package classpart.alone;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.age = 40;
		person.name = "James";
		person.marry = true;
		person.child = 3;
		
		System.out.println("³ªÀÌ :" + person.age);
		System.out.println("ÀÌ¸§ :" + person.name);
		System.out.println("°áÈ¥ :" + person.marry);
		System.out.println("ÀÚ³à :" + person.child);
		
	}

}
