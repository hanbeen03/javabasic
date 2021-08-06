package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을 때 true = 앞면, false = 뒷면으로 간주해서
		// 프로그램이 다 끝났을 때 앞면 몇회, 뒷면 몇 회 인지
		// 콘솔에 출력해주세요
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		int front = 0;
		int back = 0;
		int count = 0;
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("동전을 던질 횟수를 입력하세요.");
		int times = sc.nextInt();
		
		while(true) {
			if(count == times)
				break;
			
			if(r.nextBoolean() == true)
				front++;
			else
				back++;
			
			count++;
		}
		
		System.out.println(times + "바퀴 돌린 결과값 : ");
		System.out.println("앞면 : " + front);
		System.out.println("뒷면 : " + back);
		

	}

}
