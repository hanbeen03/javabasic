package accessmodifier.game;

public class Main {
	public static void main(String[] args) {
		Warrior w = new Warrior();
		
//		w.getAllData();
//		w.doubleAttack();
//		w.getAllData();
//		w.hunt();
//		w.getAllData();
		
//		Magician m = new Magician();
//		Monster mon = new Monster();
//		
//		m.equipStaff();
//		m.fight(mon);
//		m.fight(mon);
		
		Assassin a = new Assassin();
		/*
		a.getAllData();
		a.quickAttack();
		a.getAllData();
		a.hunt();
		a.getAllData();
		a.agilityPotion();
		a.getAllData();
		a.quickAttack();
		a.getAllData();
		*/
		
		
		a.getAllData();
		while(true) {
			a.hunt();
			if (a.getHP() - 2 < 0) {
				a.hunt();
				break;
			}
		}
		
		a.getAllData();
		
		/*
		while(true) {
			a.quickAttack();
			if (a.getMP() - 5 < 0) {
				a.quickAttack();
				break;
			}
		}
		*/
		
		/*
		a.getAllData();
		a.hpPotion();
		a.getAllData();
		a.mpPotion();
		a.getAllData();
		a.levelUp();
		a.getAllData();
		*/
		
		a.getAllData();
		a.powerAttack();
		a.getAllData();
		a.healingCharm();
		a.getAllData();		
		a.healingCharm();
		a.mpPotion();
		a.getAllData();
		a.healingCharm();
		a.getAllData();
		a.levelUp();
		a.getAllData();
		a.mpPotion();
		a.getAllData();
		a.healingCharm();
		a.getAllData();
		
		
	}
}
