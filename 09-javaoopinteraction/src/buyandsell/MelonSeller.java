package buyandsell;

public class MelonSeller {
	private int money;
	private int melon;
	
	public MelonSeller ( int melon ) {
		this.melon = melon;
		this.money = 0;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public int getMelon() {
		return this.melon;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setMelon(int melon) {
		this.melon = melon;
	}
	
	public void showSeller() {
		System.out.println("소유한 돈 : " + this.money + "원");
		System.out.println("소유한 멜론 : " + this.melon + "개");
	}
}
