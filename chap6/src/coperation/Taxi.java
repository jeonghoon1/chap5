package coperation;

public class Taxi {
	String taxiNumber;
	int money;
	int passengerCount;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += 10000;
		this.passengerCount++;
	}
	public void printTaxiInfo() {
		System.out.println("�ý�" + taxiNumber + "�� �°���" + passengerCount + "�� �̰�, ���� �ݾ���" + money + "�� �Դϴ�.");
		
	}
}


