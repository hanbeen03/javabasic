package inheritance.game;

public class Main1 {
	public static void main(String[] args) {
		// 초보자계정 하나를 생성하고 확인해주세요.
		
		Commoner a = new Commoner();
		
		a.id = "김삿갓";
		a.level = 1;
		a.hp = 500;
		a.mp = 500;
		
		//a.getInfo();
		
		Warrior b = new Warrior();
		
		b.id = "김삿갓";
		b.level = 5;
		b.hp = 2000;
		b.mp = 2000;
		b.attackDamage = 13;
		
		//b.getInfo();
		
		Assassin c = new Assassin();
		
		c.id = "우왕굳";
		c.level = 10;
		c.hp = 3000;
		c.mp = 1500;
		c.agility = 30;
		
		c.getInfo();
		System.out.println("------------------");
		
		Magician d = new Magician();
		
		d.id = "킹법사";
		d.level = 8;
		d.hp = 2500;
		d.mp = 3500;
		d.distantDamage = 20;
		
		d.getInfo();
	}
}
