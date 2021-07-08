package coperation.q5;

public class Star {

	public String name;
	public int money;
	
	public Star(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarbucks(Starbucks star1) {
		this.money -=4000;
		star1.buy(4000);
	}
	
	public void buyKong(Kong kong) {
		this.money -=4500;
		kong.buy(4500);
	}
	public void printStudentInfo() {
		System.out.println(name + "은 먹고난 뒤" + money + "원 입니다.");
	}
}
