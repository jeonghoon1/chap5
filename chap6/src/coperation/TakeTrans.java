package coperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student tom = new Student("tom" , 5000);
		Bus bus1004 = new Bus(1004);
		tom.takeBus(bus1004);
		tom.printStudentInfo();
		bus1004.printbusinfo();
	
		Subway greenLine = new Subway("2ȣ��");
		Student jam = new Student("jam" , 10000);
		jam.takeSubway(greenLine);  // 2ȣ�� ����ö�� ź��.
		
		jam.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Taxi name = new Taxi("����������");
		Student hoon = new Student("hoon" , 20000);
		hoon.takeTaxi(name);
		
		hoon.printStudentInfo();
		name.printTaxiInfo();
		

	}

}
