package structure;

public class ClassMain2 {
	public static void main(String[] args) {
		
		Dog a = new Dog();
		Dog b = new Dog();
		
		a.name = "아로";
		a.age = 14;
		a.kind = "시츄";
		a.eat = true;
		
		b.name = "밤돌이";
		b.age = 5;
		b.kind = "코카스파니엘";
		b.eat = false;
		
		a.getInfo();
		System.out.println("-------------------");
		b.getInfo();
		
	}
}
