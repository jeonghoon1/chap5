package coperation;

public class Bus {
	int busNumber;   //���� ��ȣ
	int money;   // ����
	int passengerCount;  // �°� ��
	
	
	public Bus(int busNumber) {      // ���� ��ȣ�� �Ű� ������ ���� ������
		this.busNumber = busNumber;
	}
	
	// ������ �°��� �¿�� �޼���
	public void take(int money) {
		this.money += 1000;
		this.passengerCount++;
	}
	public void printbusinfo() {
		System.out.println(busNumber + "�� ������ �°���" + passengerCount + " �� �̰�, " + "������" + money + "�Դϴ�.");
	}
	
}
