package coperation;

public class Bus {
	int busNumber;   //버스 번호
	int money;   // 수입
	int passengerCount;  // 승객 수
	
	
	public Bus(int busNumber) {      // 버스 번호를 매개 변수로 갖는 생성자
		this.busNumber = busNumber;
	}
	
	// 버스가 승객을 태우는 메서드
	public void take(int money) {
		this.money += 1000;
		this.passengerCount++;
	}
	public void printbusinfo() {
		System.out.println(busNumber + "번 버스의 승객은" + passengerCount + " 명 이고, " + "수입은" + money + "입니다.");
	}
	
}
