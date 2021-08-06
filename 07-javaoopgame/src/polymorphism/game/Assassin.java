package polymorphism.game;

public class Assassin {
	private int hp;
	private int mp;
	private int attack;
	private int defence;
	private int level;
	private int exp;
	private boolean isDead;
	
	public Assassin () {
		this.hp = 350;
		this.mp = 250;
		this.attack = 25;
		this.defence = 5;
		this.level = 1;
		this.exp = 0;
		this.isDead = false;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public void hunt(Monster m) {
		
		if(m.isDead() == true) {
			System.out.println("이 Monster은 죽어있습니다.");
			return;
		}
		
		if(this.isDead == true) {
			System.out.println("User가 전투불능 상태입니다.");
			return;
		}
		
		
		System.out.println("전투를 시작합니다.\n");
		
		while(true) {
	
			if(this.getHp() <= 0) {
				this.setHp(0);
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("Monster 체력 : " + m.getHp());
				System.out.println("-----------------------");
				System.out.println("당신은 사망하셨습니다.\n\n");
				this.isDead = true;
				break;
			} else if (m.getHp() <=0) {
				m.setHp(0);
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("Monster 체력 : " + m.getHp());
				System.out.println("-----------------------");
				System.out.println("몬스터를 무찔렀습니다.");
				this.setExp(this.getExp() + m.getExp());
				System.out.println("경험치를 " + m.getExp() + " 획득하셨습니다.\n\n");
				m.setDead(true);
				break;
			}
			
			if ((int)(Math.random() * 3) == 1) {
				this.quickAttack(m);
			} else {
				System.out.println("User가 공격합니다.");
				m.setHp(m.getHp() + m.getDefence() - this.getAttack());
			}
			
			if(m.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("Monster 체력 : " + m.getHp());
			System.out.println("-----------------------\n");
			
			System.out.println("Monster이 공격합니다.");
			this.setHp(this.getHp() + this.getDefence() - m.getAttack());
			
			if(this.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("Monster 체력 : " + m.getHp());
			System.out.println("-----------------------\n");
		}
	}
	
	public void quickAttack (Monster m) {
		
		if(this.getMp() - 30 < 0) {
			System.out.println("마나가 부족합니다.");
			return;
		} else {
			System.out.println("User가 신속 공격을 시도합니다.");
			this.setMp(this.getMp() - 30);
			m.setHp(m.getHp() - (this.getAttack() * 2));
		}
		
	}
	
	public void showStatus() {
		System.out.println("------------------------");
		System.out.println("체력 : " + this.getHp());
		System.out.println("마나 : " + this.getMp());
		System.out.println("공격력 : " + this.getAttack());
		System.out.println("방어력 : " + this.getDefence());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("경험치 : " + this.getExp());
		System.out.println("------------------------");
		
	}
}
