package polymorphism;

public class BusinessMan extends Person {
	
	public int salary;
	
	public BusinessMan (String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public void showBusinessMan () {
		super.showPerson();
		System.out.println("연봉 : " + this.salary);
		System.out.println("---------------------");
	}
	
	@Override
	public void showPerson () {
		super.showPerson();
		System.out.println("연봉 : " + this.salary);
		System.out.println("--------------");
	}
	
	
}
