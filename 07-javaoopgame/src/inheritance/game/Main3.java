package inheritance.game;

public class Main3 {
	public static void main(String[] args) {
		Assassin c = new Assassin();
				
		c.id = "우왕굳";
		c.level = 10;
		c.hp = 3200;
		c.mp = 1500;
		c.agility = 30;
				
		c.getInfo();
		System.out.println("------------------");
				
		Magician d = new Magician();
				
		d.id = "킹법사";
		d.level = 8;
		d.hp = 2300;
		d.mp = 3500;
		d.distantDamage = 20;
				
		d.getInfo();
	}
}
