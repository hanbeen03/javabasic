package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		/*
		Necromancer n = new Necromancer();
		Monster a = new Demon();
		Monster b = new DoomKnight();
		Monster c = new Zombie();
		
		n.hunt(a);
		n.hunt(b);
		n.hunt(c);
		//n.hunt(a);
		 */
		
		Assassin a = new Assassin();
		Necromancer n = new Necromancer();
		Monster m = new GhostRider();
		
		//a.hunt(m);
		//a.showStatus();
		m.doBattle();
	}
}
