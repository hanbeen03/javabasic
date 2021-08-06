package inheritance.game;

public class Magician extends Commoner {
	public int distantDamage;
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("DISTANT DAMAGE : " + distantDamage);
	}
}
