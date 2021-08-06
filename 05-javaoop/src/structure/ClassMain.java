package structure;

public class ClassMain {
	public static void main(String[] args) {
		//Person 2명을 만들어보겠습니다.
		PersonClass p1 = new PersonClass();
		PersonClass p2 = new PersonClass();
		//Person2명 정보를 직접 기입해주세요.
		
		p1.name = "임윤아";
		p1.age = 32;
		p1.pNum = "010-1111-1111";
		p1.address = "강남구 삼성동";
		p1.eat = true;
		
		p2.name = "이순규";
		p2.age = 33;
		p2.pNum = "010-2222-2222";
		p2.address = "강남구 도곡동";
		p2.eat = false;
		
		//p1.getInfo(p1); //p1이 자기자신 p1을 조회하려고 합니다.
		//p2.getInfo(p2);
		p1.getInfo();
		p2.getInfo();
	}
}
