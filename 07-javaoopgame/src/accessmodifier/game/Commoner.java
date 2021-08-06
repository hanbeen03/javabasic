package accessmodifier.game;

public class Commoner {
	private int hp;
	private int mp;
	private int level;
	private int exp;
	private int maxHP;
	private int maxMP;
	private int requiredEXP;
	
	public Commoner() {
		this.hp = 100;
		this.mp = 50;
		this.level = 1;
		this.exp = 0;
		this.maxHP = 100;
		this.maxMP = 50;
		this.requiredEXP = 100;
	}
	
	public int getHP () {
		return this.hp;
	}
	
	public int getMP () {
		return this.mp;
	}
	
	public int getLevel () {
		return this.level;
	}
	
	public int getEXP () {
		return this.exp;
	}
	
	public int getMaxHP () {
		return this.maxHP;
	}
	
	public int getMaxMP () {
		return this.maxMP;
	}
	
	public int getRequiredEXP () {
		return this.requiredEXP;
	}
	
	public void setHP (int hp) {
		this.hp = hp;
	}
	
	public void setMP (int mp) {
		this.mp = mp;
	}
	
	public void setLevel (int level) {
		this.level = level;
	}
	
	public void setEXP (int exp) {
		this.exp = exp;
	}
	
	public void setMaxHP (int maxHP) {
		this.maxHP = maxHP;
	}
	
	public void setMaxMP (int maxMP) {
		this.maxMP = maxMP;
	}
	
	public void setRequiredEXP ( int requiredEXP ) {
		this.requiredEXP = requiredEXP;
	}
	
//	public void getAllData() {
//		System.out.println("체력 : " + this.hp);
//		System.out.println("마나 : " + this.mp);
//		System.out.println("레벨 : " + this.level);
//		System.out.println("경험치 : " + this.exp);
//		System.out.println("-----------------------");
//	}
//	
//	public void hunt() {
//		System.out.println("사냥을 시작합니다.");
//		
//		this.hp -= 2;
//		this.exp += 15;
//		
//	}
	
	
}
