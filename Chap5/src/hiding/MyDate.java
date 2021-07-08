package hiding;

public class MyDate {
     // 외부 클래스에서는 접근 불가능한 접근 제어자
	
	 // int year;  디폴트 접근 제어자, 동일 패키지 내에서만 사용 가능.
	int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}
	
	void setDay(int dday) {
		if(month == 2) {
		
			if(dday < 1 || dday > 28) {
				day = dday;
				System.out.println("날짜 오류 !");
			}
				else {
					day = dday;
					printDate(); // 메서드 호출
					
				}
			}
	
	else {
		day= dday;
		printDate();
		
		}
	}
	
	void printDate() {
		System.out.println(year  + " - " + month + " - " + day);
	}
	}

