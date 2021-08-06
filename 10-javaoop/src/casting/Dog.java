package casting;

public class Dog extends Animal {

	public Dog (String name, int age) {
		super(name, age);
	}
	
	public void howl() {
		System.out.println("개가 짖습니다.");
	}
	
	public void eat() {
		System.out.println("개가 먹습니다.");
	}
}
