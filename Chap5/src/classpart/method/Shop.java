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
		shop.Day =  "2018년 3월 12일";
		shop.Name = "홍길순";
		shop.ShopNumber = "PD-345-12";
		shop.Address = ("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문번호 : " + shop.Number);
		System.out.println("주문자 아이디 : " + shop.Id);
		System.out.println("주문 날짜 : " + shop.Day);
		System.out.println("주문자 이름 : " + shop.Name);
		System.out.println("주문 상품 번호 : " + shop.ShopNumber);
		System.out.println("배송 주소 : " + shop.Address);
		
		
		
	}

}
