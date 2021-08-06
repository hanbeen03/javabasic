package accessmodifier.game;

public class Warrior extends Commoner {

	public Warrior() {    //별다른 변화가 없으면 부모쪽의 생성자를 호출
		super();
	}
	
	public void getAllData() {
		System.out.println("체력 : " + this.getHP() + " / " + this.getMaxHP());
		System.out.println("마나 : " + this.getMP() + " / " + this.getMaxMP());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("경험치 : " + this.getEXP());
		System.out.println("-----------------------");
	}
	
	public void hunt() {
		if(this.getHP() - 2 < 0) {
			System.out.println("HP가 부족해 사냥을 할 수 없습니다.");
		} else {
			System.out.println("사냥을 시작합니다.");
			
			this.setHP(this.getHP() - 2);
			this.setEXP(this.getEXP() + 15);
		}
		
	}
	
	public void doubleAttack() {
		if(this.getMP() - 5 < 0) {
			System.out.println("MP가 부족해 스킬을 시전할 수 없습니다.");
		} else {
			System.out.println("건곤대나이!!!");
		
			this.setMP(this.getMP() - 5);
			this.setEXP(this.getEXP() + 30);
		}
	}
}
