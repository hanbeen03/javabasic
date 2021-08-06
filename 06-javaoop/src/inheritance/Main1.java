package inheritance;

public class Main1 {
	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 23;
		s1.major = "실용음악";
		
		s1.getPersonInfo();
		System.out.println("-------------------");
		s1.getStudentInfo();
	}
}
