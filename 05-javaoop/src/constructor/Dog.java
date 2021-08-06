package constructor;

public class Dog {
	
	public String name;
	public int age;
	public String kind;
	public boolean eat;
	
	public Dog(String name, int age, String kind, boolean eat) {
		
		this.name = name;
		this.age = age;
		this.kind = kind;
		this.eat = eat;
		
		System.out.println("강아지 분양 완료!");
		System.out.println("강아지 이름 : " + name);
		System.out.println("강아지 나이 : " + age);
		System.out.println("강아지 종류 : " + kind);
		System.out.println("식사여부 : " + eat);
	}
	
	public void getInfo() {
		System.out.println("강아지 이름 : " + this.name);
		System.out.println("강아지 나이 : " + this.age);
		System.out.println("강아지 종류 : " + this.kind);
		System.out.println("식사여부 : " + this.eat);
	}
}
