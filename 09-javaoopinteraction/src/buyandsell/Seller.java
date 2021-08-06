package buyandsell;

public class Seller {
	// 판매자
	// 돈, 망고를 가집니다.
	private int money;
	private int mango;
	
	// 생성자에서 망고갯수를 입력 받을 수 있습니다.
	//돈은 0으로 넣어주세요.
	public Seller(int mango) {
		this.mango = mango;
		this.money = 0;
	}
	
	//판매시 망고 갯수를 입력할 수 있고
	//망고개수 *1000 만큼의 돈이 올라가고
	//망고는 판 갯수만큼 차감됩니다.
	//0미만으로 망고가 줄어들 수 없습니다.
	public void sellMango (int mango) {
		if(mango > this.mango) {
			System.out.println("팔려는 망고가 부족합니다.");
			return;
		} 
		
		this.money += (mango * 1000);
		this.mango -= mango;
		
		System.out.println("망고를 " + mango + "개 팔았고, " + (mango * 1000) + 
				"원을 벌었습니다.");
	}
	
	
	public int getMango() {
		return this.mango;
	}
	
	public int getMoney() {
		return this.money;
	}
	//showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있습니다.
	public void showSeller () {
		System.out.println("소유한 돈 : " + this.money + "원");
		System.out.println("소유한 망고 : " + this.mango + "개");
		//System.out.println("----------------------------");
	}
}
