package coperation.q5;

public class Starbucks {
	String name;
	int money;
	int Count;
	
	public Starbucks(String name) {
		this.name = name;
	}
	
	public void buy(int money) {
		this.money += 4000;
		this.Count++;
		
	}
	public void printbusinfo() {
		System.out.println(name + "에서 아메리카노 " + Count + "수입은" + money + "입니다.");
	}
}
