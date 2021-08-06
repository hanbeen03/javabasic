package buyandsell;

public class Main2 {

	public static void main(String[] args) {
	
	/*	
	//상인 2개 만들기
	Seller a = new Seller(50);
	Seller b = new Seller(4);
	
	//구매자 1개 만들기
	Buyer c = new Buyer(50000);
	
	//구매자 정보 확인
	c.showBuyer();
	System.out.println("----------------");
	
	//1번 상인 정보 확인
	a.showSeller();
	System.out.println("----------------");
	
	//2번상인 정보 확인
	b.showSeller();
	System.out.println("----------------");
	
	//1번 상인에게 구매자가 망고 구매
	c.buyMango(10, a);
	System.out.println("----------------");
	
	//구매자 정보 확인
	c.showBuyer();
	System.out.println("----------------");
	
	//1번 상인 정보 확인
	a.showSeller();
	System.out.println("----------------");
	
	//2번 상인 정보 확인
	b.showSeller();
	System.out.println("----------------");
	}*/
	Buyer a = new Buyer(50000);
	MelonSeller seller = new MelonSeller(20);
	
	a.buyMelon(5, seller);
	a.buyMelon(10, seller);
	a.buyMelon(20, seller);
		
	}
}
