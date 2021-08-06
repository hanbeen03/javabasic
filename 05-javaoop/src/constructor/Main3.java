package constructor;

public class Main3 {
	public static void main(String[] args) {
		
		BasketballPlayer jordan = new BasketballPlayer(200, 150);
		BasketballPlayer curry = new BasketballPlayer(190, 100);
		
		jordan.dunkShoot();
		curry.dunkShoot();
	}
}
