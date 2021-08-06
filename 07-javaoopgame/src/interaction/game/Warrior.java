package interaction.game;

public class Warrior {
	private int hp;
	private int mp;
	private int attack;
	private int defence;
	private int level;
	private int exp;
	
	public Warrior() {
	this.hp = 700;
	this.mp = 200;
	this.attack = 70;
	this.defence = 10;
	this.level = 1;
	this.exp = 0;
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
	
	public void huntDemon(Demon d) {
		
		System.out.println("전투를 시작합니다.\n");
		
		while(true) {
		
			if(this.getHp() <= 0) {
				this.setHp(0);
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("Demon 체력 : " + d.getHp());
				System.out.println("-----------------------");
				System.out.println("당신은 사망하셨습니다.\n\n");
				break;
			} else if (d.getHp() <=0) {
				d.setHp(0);
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("Demon 체력 : " + d.getHp());
				System.out.println("-----------------------");
				System.out.println("몬스터를 무찔렀습니다.\n\n");
				this.setExp(this.getExp() + 300);
				break;
			}
			
			System.out.println("User가 공격합니다.");
			d.setHp(d.getHp() + d.getDefence() - this.getAttack());
			
			if(d.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("Demon 체력 : " + d.getHp());
			System.out.println("-----------------------\n");
			
			System.out.println("Demon이 공격합니다.");
			this.setHp(this.getHp() + this.getDefence() - d.getAttack());
			
			if(this.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("Demon 체력 : " + d.getHp());
			System.out.println("-----------------------\n");
		}
	}
	
	public void huntDoomKnight (DoomKnight d) {
		
		System.out.println("전투를 시작합니다.\n");
		
		while(true) {
			
			if(this.getHp() <= 0) {
				this.setHp(0);
				
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("DoomKnight 체력 : " + d.getHp());
				System.out.println("-----------------------");
				System.out.println("당신은 사망하셨습니다.\n\n");
				break;
			} else if (d.getHp() <=0) {
				d.setHp(0);
				
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("DoomKnight 체력 : " + d.getHp());
				System.out.println("-----------------------");
				System.out.println("몬스터를 무찔렀습니다.\n\n");
				this.setExp(this.getExp() + 700);
				break;
			}
			
			System.out.println("User가 공격합니다.");
			d.setHp(d.getHp() + d.getDefence() - this.getAttack());
			
			if(d.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("DoomKnight 체력 : " + d.getHp());
			System.out.println("-----------------------\n");
			
			System.out.println("DoomKnight이 공격합니다.");
			this.setHp(this.getHp() + this.getDefence() - d.getAttack());
			
			if(this.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("DoomKnight 체력 : " + d.getHp());
			System.out.println("-----------------------\n");
		}
	}
	
	public void huntZombie (Zombie z) {
		
		System.out.println("전투를 시작합니다.\n");
		
		while(true) {
			
			if(this.getHp() <= 0) {
				this.setHp(0);
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("Zombie 체력 : " + z.getHp());
				System.out.println("-----------------------");
				System.out.println("당신은 사망하셨습니다.\n\n");
				break;
			} else if (z.getHp() <=0) {
				z.setHp(0);
				System.out.println("-----------------------");
				System.out.println("User 체력 : " + this.getHp());
				System.out.println("Zombie 체력 : " + z.getHp());
				System.out.println("-----------------------");
				System.out.println("몬스터를 무찔렀습니다.\n\n");
				this.setExp(this.getExp() + 200);
				break;
			}
			
			System.out.println("User가 공격합니다.");
			z.setHp(z.getHp() + z.getDefence() - this.getAttack());
			
			if(z.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("Zombie 체력 : " + z.getHp());
			System.out.println("-----------------------\n");
			
			System.out.println("Zombie이 공격합니다.");
			this.setHp(this.getHp() + this.getDefence() - z.getAttack());
			
			if(this.getHp() <= 0)
				continue;
			
			System.out.println("-----------------------");
			System.out.println("User 체력 : " + this.getHp());
			System.out.println("Zombie 체력 : " + z.getHp());
			System.out.println("-----------------------\n");
		}
	}
}
