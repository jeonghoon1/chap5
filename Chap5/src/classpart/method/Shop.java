package classpart.method;

public class Shop {
	
	long Number;
	String Id;
	String Day;
	String Name;
	String ShopNumber;
	String Address;
	
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		shop.Number = 201803120001L;
		shop.Id = "abc123";
		shop.Day =  "2018�� 3�� 12��";
		shop.Name = "ȫ���";
		shop.ShopNumber = "PD-345-12";
		shop.Address = ("����� �������� ���ǵ��� 20����");
		
		System.out.println("�ֹ���ȣ : " + shop.Number);
		System.out.println("�ֹ��� ���̵� : " + shop.Id);
		System.out.println("�ֹ� ��¥ : " + shop.Day);
		System.out.println("�ֹ��� �̸� : " + shop.Name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + shop.ShopNumber);
		System.out.println("��� �ּ� : " + shop.Address);
		
		
		
	}

}
