import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//Hello Java를 입력한 횟수만큼 출력하는 구문을 작성해보세요.
		//입력은 Scanner로 받습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("횟수를 입력하세요 : ");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++)
		{
			System.out.println( "Hello Java! " + (i + 1) );
		}
		
		sc.close();
	}
}
