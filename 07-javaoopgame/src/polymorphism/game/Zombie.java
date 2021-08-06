package polymorphism.game;

public class Zombie extends Monster{

	
	public Zombie () {
		super(200, 30, 4, false, 250);
	}
	
	public void doBattle() {
		System.out.println("싸우는 중입니다.");
	}
	
}
