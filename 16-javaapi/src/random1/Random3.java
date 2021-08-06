package random1;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자 범위를 지정할 수 있습니다.
		// 바로 정수로 나오기 때문에 코드가 좀 더 간결합니다.
		Random r = new Random();
		int result = r.nextInt();
		
		System.out.println(result);
	
		// 정수 숫자 하나를 파라미터로 넣어줘야 0 <= 결과값 < n 이 나옵니다.
		int result2 = r.nextInt(5);
		System.out.println(result2);
	}

}
