package interaction.game;

public class Zombie {
	private int hp;
	private int attack;
	private int defence;
	
	public Zombie () {
		this.hp = 300;
		this.attack = 30;
		this.defence = 3;
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
