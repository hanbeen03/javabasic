package inheritance;

public class Main2 {
	public static void main(String[] args) {
		Salaryman s1 = new Salaryman();
		Student s2 = new Student();
		
		s1.name = "김길동";
		s1.age = 27;
		s1.salary = 2500;
		
		s2.name = "최민지";
		s2.age = 21;
		s2.major = "건축공학";
		
		s1.upSalary();
		
		s1.getSalaryInfo();
		System.out.println("-------------------");
		s2.getStudentInfo();
	}
}
