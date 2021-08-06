package buyandsell;

public class Buyer {
	// 구매자
	// 구매자는 돈, 망고갯수를 멤버변수로 가집니다.
	// 은닉 구현을 위해서 private으로 처리합니다.
	private int money;
	private int mango;
	private int melon;
	
	// 생성자는 (int money)를 받아 돈을 초기화합니다.
	// 망고는 자동으로 0을 대입합니다.
	public Buyer (int money) {
		this.money = money;
		this.mango = 0;
		this.melon = 0;
	}
	
	
	//BuyMango는 망고를 삽니다.
	//(int mango)망고 갯수를 입력받으면, 망고 * 1000만큼의
	//돈을 차감하고 망고 변수에 그만큼 갯수를 늘려줍니다.
	public void buyMango (int mango, Seller seller) {
		// 조건식 : 망고 가격보다 내 돈이 적은 경우
		if((mango * 1000) > this.money ) {
			System.out.println("소지금이 부족합니다.");
			return;
		}
		
		//조건식 : 구매할 망고 개수보다 판매자의 재고가 적은경우
		if(mango > seller.getMango()) {
			System.out.println("상인에게 망고가 부족합니다.");
			return;
		}
		
		seller.sellMango(mango);
		this.money -= (mango * 1000);
		this.mango += mango;
		
	}
	
	//showBuyer는 구매자의 상태를 보여줍니다.
	//money, mango 수치가 각각 몇인지 콘솔에 찍어줍니다.
	public void showBuyer() {
		System.out.println("소유한 돈 : " + this.money + "원");
		System.out.println("소유한 멜론 : " + this.melon + "개");
		//System.out.println("-----------------------");
	}
	
	public void buyMelon(int melon, MelonSeller seller) {
		if( melon > seller.getMelon() ) {
			System.out.println("!상인이 가진 멜론 갯수 부족!");
			System.out.println("----------손님---------");
			this.showBuyer();
			System.out.println("----------상인---------");
			seller.showSeller();
			System.out.println("\n");
			return;
		}
		
		if( (melon * 5000) > this.money ) {
			System.out.println("!손님이 가진 돈 부족!");
			System.out.println("----------손님---------");
			this.showBuyer();
			System.out.println("----------상인---------");
			seller.showSeller();
			System.out.println("\n");
			return;
		}
		
		this.money -= (melon * 5000);
		this.melon += melon;
		seller.setMelon(seller.getMelon() - melon);
		seller.setMoney(seller.getMoney() + (melon * 5000));
		
		System.out.println("!거래 성공!");
		System.out.println("----------손님---------");
		this.showBuyer();
		System.out.println("----------상인---------");
		seller.showSeller();
		System.out.println("\n");
	}
}
