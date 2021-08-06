package accessmodifier.game;

public class Monster {
	private int hp;
	private int attackPower;
	private int physicalDefence;
	private int distantDefence;
	
	public Monster () {
		this.hp = 200;
		this.attackPower = 15;
		this.physicalDefence = 2;
		this.distantDefence = 2;
	}
	
	public int getHP () {
		return this.hp;
	}
	
	public int getAttackPower () {
		return this.attackPower;
	}
	
	public int getPhysicalDefence () {
		return this.physicalDefence;
	}
	
	public int getDistantDefence() {
		return this.distantDefence;
	}
	
	public void setHP (int hp) {
		this.hp = hp;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void setPhysicalDefence(int physicalDefence) {
		this.physicalDefence = physicalDefence;
	}
	
	public void setDistantDefence(int distantDefence) {
		this.distantDefence = distantDefence;
	}
}
