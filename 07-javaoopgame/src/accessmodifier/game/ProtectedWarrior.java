package accessmodifier.game;

public class ProtectedWarrior extends ProtectedCommoner {
	public void doubleAttack() {
		System.out.println("건곤대나이!!!");
		this.mp -= 5;
		this.exp += 30;
	}
}
