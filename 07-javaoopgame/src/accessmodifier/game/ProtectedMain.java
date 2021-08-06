package accessmodifier.game;

public class ProtectedMain {
	public static void main(String[] args) {
		
		ProtectedWarrior pw = new ProtectedWarrior();
		
		pw.getAllData();
		pw.doubleAttack();
		pw.getAllData();
		pw.hunt();
		pw.getAllData();
	}
}
