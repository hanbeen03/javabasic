package casting;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//동물 행동을 하나 아무거나 메서드로 만들어주세요
	public void eat() {
		System.out.println("동물이 먹습니다.");
	}
}
