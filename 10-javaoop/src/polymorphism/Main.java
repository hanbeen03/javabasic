package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		//부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능
		Person a1 = new BusinessMan("홍길동", 25, 3000);
		Person s1 = new Student("진설화", 30, 3);
		
		//단 메서드는 Person을 베이스 객체는
		//Person에 정의된 메서드만 호출 가능
		a1.showPerson(); 
		//a1.showBusinessMan();  X
		s1.showPerson();
		//s1.showStudent();   X
		
		Person b = new Programmer("김갑질", 28, "Java");
		b.showPerson();
	}
}
