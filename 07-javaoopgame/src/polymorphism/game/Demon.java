package polymorphism.game;

public class Demon extends Monster{

	
	public Demon () {
		super(100, 20, 5, false, 200);
	}

	public void doBattle() {
		System.out.println("싸우는 중입니다.");
	}
	
}
