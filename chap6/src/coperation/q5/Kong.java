package coperation.q5;

public class Kong {

	String name;
	int money;
	int Count;
	
	public Kong(String name) {
		this.name =	name;
		
	}
	
	public void buy(int money) {
		this.money += 4500;
		this.Count++;
	}
	public void printbusinfo() {
		System.out.println(name + "���� �� " + Count + "������" + money + "�Դϴ�.");
	}
}
