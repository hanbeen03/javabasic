import java.util.Scanner;

public class Bonus2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int count;
		
		for(int i=4; i<=n; i++)
		{
			count = 0;
			for(int j=1; j<=i; j++)
			{
				if(i % j ==0)
				{
					count++;
				}
			}
			if(count == 2)
				System.out.println(i + "는 소수입니다.");
		}
	}
}
