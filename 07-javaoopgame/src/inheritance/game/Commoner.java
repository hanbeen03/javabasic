package inheritance.game;

public class Commoner {
	//레벨, 체력, 아이디, 마나수치를 변수로 만들어주세요
	public String id;
	public int level;
	public int hp;
	public int mp;
	
	
	//메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록
	//구성해주시면 됩니다.
	public void getInfo() {
		System.out.println("ID    : " + id);
		System.out.println("LEVEL : " + level);
		System.out.println("HP    : " + hp);
		System.out.println("MP    : " + mp);
	}
	
}
