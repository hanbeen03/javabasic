package structure;

public class Dog {
	public String name;
	public int age;
	public String kind;
	public boolean eat;
	
	
	public void getInfo() {
		System.out.println("강아지이름 : " + this.name);
		System.out.println("강아지나이 : " + this.age);
		System.out.println("강아지품종 : " + this.kind);
		System.out.println("식사여부 : " + this.eat);
	}
}
