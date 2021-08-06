package accessmodifier.game;

public class Magician extends Commoner{
	
	private int distantDamage;
	
	public Magician() {
		super();
		this.distantDamage = 20;
	}
	
	public int getDistantDamage() {
		return this.distantDamage;
	}
	
	public void setDistantDamage(int distantDamage) {
		this.distantDamage = distantDamage;
	}
	
	public void getAllData() {
		System.out.println("체력 : " + this.getHP() + " / " + this.getMaxHP());
		System.out.println("마나 : " + this.getMP() + " / " + this.getMaxMP());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("경험치 : " + this.getEXP() + " / " + this.getRequiredEXP());
		System.out.println("원거리공격력 : " + this.distantDamage);
		System.out.println("-----------------------");
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
	
	public void fight(Monster m) {
		System.out.println("전투를 시작합니다.");
		System.out.println();
		int tempYourMaxHP = this.getHP();
		int tempMonsterMaxHP = m.getHP();
		
		while(true) {
			if(this.getHP() < 0 || m.getHP() < 0) {
				if(this.getHP() < 0) {
					this.setHP(0);
					System.out.println("당신은 사망하셨습니다.");
				} else if(m.getHP() < 0) {
					m.setHP(0);
					System.out.println("몬스터가 죽었습니다.");
				}
				break;
			} else {
				System.out.println("당신이 공격합니다.");
				m.setHP(m.getHP() - this.getDistantDamage());
				System.out.println("당신체력 : " + this.getHP() + " / " + tempYourMaxHP + ", 몬스터 체력 : "
						+ m.getHP() + " / " + tempMonsterMaxHP);
				System.out.println("--------------------------------");
				System.out.println("몬스터가 공격합니다.");
				this.setHP(this.getHP() - m.getAttackPower());
				System.out.println("당신체력 : " + this.getHP() + " / " + tempYourMaxHP + ", 몬스터 체력 : "
						+ m.getHP() + " / " + tempMonsterMaxHP);
				System.out.println("--------------------------------");
			}
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
	
	public void equipStaff() {
		this.setDistantDamage(this.getDistantDamage() + 20);
		
		System.out.println("스태프를 장착하셨습니다.");
		System.out.println("현재 공격력 : " + this.getDistantDamage());
		System.out.println("--------------------------");
	}
	
	public void fireBall() {
		if(this.getMP() - 5 < 0) {
			System.out.println("MP가 부족해 스킬을 시전할 수 없습니다.");
		} else {
			System.out.println("열화참주!!!");
		
			this.setMP(this.getMP() - 5);
			this.setEXP(this.getEXP() + 30);
		}
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