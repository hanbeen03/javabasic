import java.util.Scanner;

public class Break4 {
	public static void main(String[] args) {
		// Scanner로 정수를 입력받으세요
		// 1~n까지 차곡차곡 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램을 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int num = sc.nextInt();
		int add = 0;
		int count = 0;
		int i = 0;
		
		while(true)
		{
			count++;
			i++;
			add += i;
			System.out.println("1부터 " + i + "까지의 총합은 : " + add +"입니다.");
			
			if(add > num)
			{
				break;
			}
		}
		System.out.println("목표값 : " + num);
		System.out.println("총 합 : " + add);
		System.out.println("몇 까지 더했나? : " + count);
	}
}
