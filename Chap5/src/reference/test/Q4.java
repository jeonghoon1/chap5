package reference.test;

public class Q4 {

	private int day;
	private int month;
	private int year;
	public boolean isValid = true;
	
	public Q4(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
			
			switch (month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				if (day > 31 || day < 0) {
					isValid = false;
					}
				break;
			case 4 : case 6 : case 9 : case 11:
				if(day > 30 || day < 0) {
					isValid = false;
				}
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					if (day < 0 || day > 29) {
						isValid = false;
					}
				} else {
					if (day <0 || day > 28) {
						isValid = false;
					}
				}
				break;
				default : isValid = false;
			}

	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
		if (month > 12 || month < 1) {
			isValid = false;
		}
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		
		if ( year < 1) {
			isValid = false;
		}
	}
	
	public void isValid () {
		
		if(isValid) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
		
	
}
	

