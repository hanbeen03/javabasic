import java.util.Scanner;

public class Continue2 {
	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요.
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int n = sc.nextInt();
		int total = 0;
		
		for(int i=1; i <= n; i++)
		{
			if( i % 2 == 0)
				continue;
			else
			{
				total += i;
				System.out.println("현재 1부터 " + i + "까지 더했습니다.");
				System.out.println("총합은 " + total + "입니다.");
			}
		}
	}
}
