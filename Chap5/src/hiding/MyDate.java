package hiding;

public class MyDate {
     // �ܺ� Ŭ���������� ���� �Ұ����� ���� ������
	
	 // int year;  ����Ʈ ���� ������, ���� ��Ű�� �������� ��� ����.
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
				System.out.println("��¥ ���� !");
			}
				else {
					day = dday;
					printDate(); // �޼��� ȣ��
					
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

