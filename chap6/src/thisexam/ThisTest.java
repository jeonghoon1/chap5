package thisexam;

public class ThisTest {

	public static void main(String[] args) {

		BirthDay day1 = new BirthDay ();
		System.out.println(day1);
		day1.printThis();
		day1.setYear(2000);
		BirthDay day2 = new BirthDay ();
		System.out.println(day2);
		day2.printThis();
		day2.setYear(1999);
	
	System.out.println(day1.year);
	System.out.println(day2.year);
	}

}
