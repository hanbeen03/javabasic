import java.util.Random;

public class SwitchCase2 {
	public static void main(String[] args) {
		//Random r = new Random();
		
		//int num = r.nextInt(10);
		
		//System.out.println(num);
		
		//Math.random();을 이용해 난수를 하나 발급받을 수 있고
		// 난수의 범위는 0초과 1미만입니다.
		//뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있습니다.
		double number = Math.random() * 10;
		//int intNum = (int)(Math.random() * 10); // 0~9
		int intNum = (int)(Math.random() * 7) + 1; //1~7
		System.out.println(intNum);
		
		//Switch~Case 문을 이용해서
		//식당 이름을 출력하는
		//프로그램을 만들어보세요. (최소 6개)
		
		switch(intNum)
		{
		case 1:
			System.out.println("풀뜯는돼지");
			break;
		case 2:
			System.out.println("그리너리 테이블");
			break;
		case 3:
			System.out.println("부부드꼼뜨와");
			break;
		case 4:
			System.out.println("브런치가");
			break;
		case 5:
			System.out.println("토끼정 홍대");
			break;
		case 6:
			System.out.println("올더플레이트");
			break;
		default:
			System.out.println("큰맘할매순대국");
			break;
		}
	}
}
