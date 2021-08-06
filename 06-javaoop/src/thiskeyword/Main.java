package thiskeyword;

public class Main {
	public static void main(String[] args) {
		//this가 적용된 Person 생성하기
		//생성시 Ctrl + Space를 누르면 입력하 요소가 출력됨
		Person p1 = new Person("홍길동", 25, 10000, "경제학");
		p1.getInfo();
				
		Person p2 = new Person("이초선", 24, 50000, "심리학");
		p2.getInfo();
	}
}
