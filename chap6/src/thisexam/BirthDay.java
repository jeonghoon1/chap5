package thisexam;

public class BirthDay {

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;   //자기자신을 가르키는 this
	}
	
	public void printThis() {
	 System.out.println(this);
	 
	}
}
