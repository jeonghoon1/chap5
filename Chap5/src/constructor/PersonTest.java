package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();   // 디폴트 생성자 : 클래스 이름과 같고 매개변수는 없으며 반환 값이 없는 특수한 형태의 함수
		
		System.out.println(person);
		person.Name = "최정훈" ;
		person.height =  170 ;
		person.weight = 60 ; 
		System.out.println(person.Name +"님의 키는" + person.height +"이고"+ "몸무게는" + person.weight + "입니다.");
		
		Person personLee = new Person("이루마" , 150, 65) ;
		System.out.println(personLee.Name +"님의 키는" + personLee.height +"이고"+ "몸무게는" + personLee.weight + "입니다.");
	}

}
