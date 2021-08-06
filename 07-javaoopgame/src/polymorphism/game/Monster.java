package polymorphism.game;

public abstract class Monster {
	private int hp;
	private int attack;
	private int defence;
	private boolean isDead;
	private int exp;
	
	public Monster(int hp, int attack, int defence, boolean isDead, int exp) {
		this.hp = hp;
		this.attack = attack;
		this.defence = defence;
		this.isDead = isDead;
		this.exp = exp;
	}

	public abstract void doBattle();
	
	
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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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
	
}
