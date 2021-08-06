package polymorphism.game;

public class DoomKnight extends Monster {

	
	public DoomKnight () {
		super(500, 40, 10, false, 400);
	}

	public void doBattle() {
		System.out.println("싸우는 중입니다.");
	}
	
}
