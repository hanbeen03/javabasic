package date210623.method;

public class MethodBonus1 {

	//return 구문은 실행 즉시 메서드를 종료시킵니다.
	//단, 자바에서는 return 아래쪽에 코드를 적는 것만으로도
	//컴파일러가 문법 오류로 간주합니다.
	public static void returnTest() {
		System.out.println("리턴구문 위쪽");
		if(2 < 0) {
			//단, 조건문 내부의 return문 아래에는
			//추가 코드를 작성할 수 있다.
			//이 경우 break문처럼 즉시 메서드를 종료시킨다.
			return;
		}
		System.out.println("리턴구문 아래쪽");
	}
	
	public static void main(String[] args) {
		returnTest();
	}
}
