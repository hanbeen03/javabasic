package abstract1;

//추상클래스
//abstract선언이 붙은 클래스는 new를 이용한
//직접적인 객체 생성이 불가능하다.
public abstract class Parent {
	public int a;
	
	public Parent() {
		this.a = 5;
	}
	
	//추상 메서드, 아래와 같이 실행문 없이 작성한다.
	public abstract void getA();
	
	//추상 메서드 내부의 일반 클래스는 그냥 평범하게 작성한다.
	public void getInfo() {
		System.out.println("일반 메서드입니다.");
	}
}
