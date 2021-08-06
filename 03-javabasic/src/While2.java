import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		//스캐너를 이용해서 String num 변수에
		//"문자열 형태인 숫자"를 입력받게 해 주세요.
		//이 문자자료 num을 int loop 변수에 정수로 변환해 저장하세요.
		//loop 변수에 입력된 정수 횟수만큼
		//"반복문을 실행합니다(횟수)" 라는 문장이 콘솔에 출력되도록
		//while문을 작성해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 형태인 숫자를 입력하시오 : ");
		String num = sc.nextLine();
		
		int loop = Integer.parseInt(num);
		int a = 1;
		
		while(a <= loop) {
			System.out.println("반복문을 실행합니다." + a + "번");
			a++;
		}
	}
}
