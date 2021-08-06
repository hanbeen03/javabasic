package exception2;

import java.util.Scanner;

public class IfElse {
	//int a, b에 스캐너로 각각 정수 입력을 받아주세요.
	// a / b의 결과를 콘솔창에 띄워주시되
	// if~else문을 이용해 0으로 나누는 에러 발생이 일어나기 전에
	// 나누는 수에는 0을 입력할 수 없습니다
	// 라고 경고만 띄우도록 처리해주세요.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a를 입력해주세요 : ");
		int a = sc.nextInt();
		int b;
		
		while(true) {
			System.out.print("b를 입력해주세요 : ");
			b = sc.nextInt();
			
			if(b != 0) {
				break;
			} else {
				System.out.println("나누는 수에는 0을 입력할 수 없습니다.");
			}
		}
		
		System.out.println("a / b 결과 : " + (a / b));
	}
}
