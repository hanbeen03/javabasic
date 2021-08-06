package accessmodifier.game;

public class ProtectedCommoner {
	protected int hp;
	protected int mp;
	protected int level;
	protected int exp;
	
	public ProtectedCommoner() {
		this.hp = 100;
		this.mp = 50;
		this.level = 1;
		this.exp = 0;
	}
	
	public void hunt() {
		System.out.println("사냥을 시작합니다.");
		
		this.hp -= 2;
		this.exp += 15;
	}
	
	public void getAllData() {
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("레벨 : " + this.level);
		System.out.println("경험치 : " + this.exp);
		System.out.println("-----------------------");
	}
}
