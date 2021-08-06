package interaction.game;

public class Titan {
	private int hp;
	private int attack;
	private int defence;
	private boolean isDead;
	
	public Titan () {
		this.hp = 600;
		this.attack = 70;
		this.defence = 10;
		this.isDead = false;
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

	public boolean getIsDead() {
		return this.isDead;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	
}
