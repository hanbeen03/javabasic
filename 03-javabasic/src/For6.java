import java.util.Scanner;

public class For6 {
	public static void main(String[] args) {
		//scanner로 정수를 입력받게 해 주세요.
		//입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		//중첩 반복문을 작성해주세요
		// ex)3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
