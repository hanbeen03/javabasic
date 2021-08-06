package inheritance.game;

public class Assassin extends Commoner{
	public int agility;
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("AGILITY : " + agility);
	}
}
