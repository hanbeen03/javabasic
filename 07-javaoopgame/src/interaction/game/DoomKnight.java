package interaction.game;

public class DoomKnight {
	private int hp;
	private int attack;
	private int defence;
	
	public DoomKnight () {
		this.hp = 1000;
		this.attack = 60;
		this.defence = 10;
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
