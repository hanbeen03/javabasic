package structure;

public class Structure2 {
	
	//Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}
	
	public static void getCatInfo(Cat c) {
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.kind);
	}
	
	public static void main(String[] args) {
		//사람을 두 명 만들어보세요(a, b)
		
		Person a = new Person();
		a.name = "홍길동";
		a.age = 30;
		a.pNum = "010-1234-1234";
		a.address = "서울시 강남구";
		
		Person b = new Person();
//		b.name = "아수라";
//		b.age = 26;
//		b.pNum = "010-5678-5678";
//		b.address = "서울시 도봉구";
		
		getInfo(a);
		getInfo(b);
		
		System.out.println(a); //주소값 찍힌다.
		System.out.println(b); //주소값 찍힌다.
		
		System.out.println("----------------------------");
		
		Cat c = new Cat();
		Cat d = new Cat();
		
		c.name = "마리";
		c.age = 7;
		c.kind = "페르시안";
		
		d.name = "아로";
		d.age = 12;
		d.kind = "스핑크스";
		
		getCatInfo(c);
		getCatInfo(d);
	}
}
