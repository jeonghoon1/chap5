package coperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student tom = new Student("tom" , 5000);
		Bus bus1004 = new Bus(1004);
		tom.takeBus(bus1004);
		tom.printStudentInfo();
		bus1004.printbusinfo();
	
		Subway greenLine = new Subway("2호선");
		Student jam = new Student("jam" , 10000);
		jam.takeSubway(greenLine);  // 2호선 지하철을 탄다.
		
		jam.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Taxi name = new Taxi("동서대지점");
		Student hoon = new Student("hoon" , 20000);
		hoon.takeTaxi(name);
		
		hoon.printStudentInfo();
		name.printTaxiInfo();
		

	}

}
