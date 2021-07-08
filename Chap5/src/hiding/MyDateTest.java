package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date =new MyDate ();
		date.year = 2021;
		
		/*date.month = 7;
		date.day = 6;
		
		System.out.println(date.year + "³â" + date.month + "¿ù" + date.day + "ÀÏ");
		*/
		date.setMonth(2);
		date.setDay(21);
		date.printDate();
		}

}
