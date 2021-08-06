package polymorphism;

public class Programmer extends Person {
	private String skill;
	
	public Programmer (String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}
	
	@Override
	public void showPerson () {
		super.showPerson();
		System.out.println("언어 : " + this.skill);
		System.out.println("--------------------");
	}
}
