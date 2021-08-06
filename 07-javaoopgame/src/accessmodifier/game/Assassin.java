package accessmodifier.game;

public class Assassin extends Commoner{

	private int agility;
	
	public Assassin () {
		super();
		this.agility = 15;
	}
	
	public int getAgility () {
		return this.agility;
	}
	
	public void setAgility (int agility) {
		this.agility = agility;
	}
	
	public void getAllData () {
		System.out.println("체력 : " + this.getHP() + " / " + this.getMaxHP());
		System.out.println("마나 : " + this.getMP() + " / " + this.getMaxMP());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("경험치 : " + this.getEXP() + " / " + this.getRequiredEXP());
		System.out.println("민첩 : " + this.agility);
		System.out.println("-------------------------");
	}
	
	public void hunt() {
		if(this.getHP() - 2 < 0) {
			System.out.println("HP가 부족해 사냥을 할 수 없습니다.");
		} else {
			System.out.println("사냥을 시작합니다.");
			
			this.setHP(this.getHP() - 2);
			this.setEXP(this.getEXP() + 15);
		}
	}
	
	public void quickAttack () {
		if(this.getMP() - 5 < 0) {
			System.out.println("MP가 부족해 스킬을 시전할 수 없습니다.");
		} else {
			System.out.println("필살검무!!!");
		
			if(this.agility > 50) {
				System.out.println("연속 공격 성공!!!");
			}
			
			this.setMP(this.getMP() - 5);
			this.setEXP(this.getEXP() + 30);
		}
	}
	
	public void powerAttack () {
		if(this.getMP() - 15 < 0) {
			System.out.println("MP가 부족해 스킬을 시전할 수 없습니다.");
		} else {
			System.out.println("흡성대법!!!");
			
			this.setMP(this.getMP() - 15);
			this.setEXP(this.getEXP() + 50);
		}
	}
	
	public void healingCharm () {
		if(this.getMP() - 20 < 0) {
			System.out.println("MP가 부족해 스킬을 시전할 수 없습니다.");
		} else {
			System.out.println("누리의기원!!!");
			
			this.setMP(this.getMP() - 20);
			
			if(this.getHP() + 60 > this.getMaxHP())
				this.setHP(this.getMaxHP());
			else
				this.setHP(this.getHP() + 60);
			
			System.out.println("체력이 회복되었습니다.");
		}
	}
	
	public void hpPotion() {
		if(this.getHP() + 50 > this.getMaxHP())
			this.setHP(this.getMaxHP());
		else
			this.setHP(this.getHP() + 50);
		
		System.out.println("체력이 회복되었습니다.");
	}
	
	public void mpPotion() {
		if(this.getMP() + 50 > this.getMaxMP())
			this.setMP(this.getMaxMP());
		else
			this.setMP(this.getMP() + 50);
		
		System.out.println("마나가 회복되었습니다.");
	}
	
	public void agilityPotion () {
		System.out.println("민첩이 일시적으로 상승합니다.");
		this.setAgility(this.getAgility() + 50);
	}
	
	public void levelUp() {
		while(true) {
			if(this.getEXP() >= this.getRequiredEXP()) {
				this.setLevel(this.getLevel() + 1);
				this.setEXP(this.getEXP() - this.getRequiredEXP());
				this.setRequiredEXP(this.getRequiredEXP() + 200);
				this.setMaxHP(this.getMaxHP() + 50);
				this.setMaxMP(this.getMaxMP() + 30);
				
				System.out.println("레벨이 올랐습니다!!!");
			} else {
				break;
			}
		}
	}
}
