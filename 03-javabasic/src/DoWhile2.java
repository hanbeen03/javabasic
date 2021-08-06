import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		// 여러분들이 배달 어플을 만들었습니다.
		// 이 어플은 주문금액을 입력받습니다.
		// 주문 금액이 15000 미만이면 프로그램이 멈춥니다.
		// 주문 금액은 Scanner를 이용해 order변수에 직접 입력받습니다.
		// 단, do while로 작성해  첫 주문은 주문금액이 15000미만이어도
		//"배달을 완료했습니다."라고 출력한 뒤
		// 다시 주문금액을 입력받는 로직을 반복문 내부에 작성해주세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주문금액을 입력해주세요 : ");
		int order = sc.nextInt();
		
		do {
			System.out.println("주문금액은 " + order + "원입니다.");
			System.out.println("배달을 완료했습니다.");
			System.out.print("다음 주문금액을 입력해주세요 : ");
			order = sc.nextInt();
		} while ( order >= 15000);
		System.out.println("금액이 모자라 배달 서비스가 종료되었습니다.");
		
		sc.close();
	}
}
