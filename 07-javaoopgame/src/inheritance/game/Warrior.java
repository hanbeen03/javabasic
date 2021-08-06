package inheritance.game;

// Commoner 상속을 받게 해 주세요.
public class Warrior extends Commoner{
	// Commoner 상속으로 인해 체력, 마나, 레벨, 아이디 수치는
	//이미 변수로 기입되어 있음
	//전사 클래스는 평민과 달리 물리공격력 수치를 부여받게 해주세요.
	public int attackDamage;
	
	
	//getInfo()함수를 이름 그대로 다시 재정의합니다.
	//Warrior의 물리데미 수치까지 같이 콘솔에 찍어주도록 작성해주세요.
	
	@Override
	public void getInfo() {
		//System.out.println("ID : " + id);
		//System.out.println("LEVEL : " + level);
		//System.out.println("HP : " + hp);
		//System.out.println("MP : " + mp);
		super.getInfo();
		System.out.println("ATTACK DAMAGE : " + attackDamage);
	}
	
}
