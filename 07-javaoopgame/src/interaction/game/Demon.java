package interaction.game;

public class Demon {
	private int hp;
	private int attack;
	private int defence;
	private boolean isDead;
	
	public Demon () {
		this.hp = 200;
		this.attack = 30;
		this.defence = 5;
		this.isDead = false;
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}
	
	public void setIsDead(boolean isDead) {
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



	public void attackUser() {
		
	}
}
