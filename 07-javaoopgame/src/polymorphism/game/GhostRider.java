package polymorphism.game;

public class GhostRider extends Monster{

	
	public GhostRider () {
		super(400, 30, 7, false, 300);
	}
	
	public void doBattle() {
		System.out.println("싸우는 중입니다.");
	}
}
