package casting;

public class Cat  extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	public void meow () {
		System.out.println("고양이가 웁니다.");
	}
	
	public void eat() {
		System.out.println("고양이가 먹습니다.");
	}
}
