import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double rate = 1117.40;
		
		System.out.println("미국 달러의 환율은 " + rate + "입니다.\n" + "원화를 입력해주세요 : ");
		int won = sc.nextInt();
		
		
		//System.out.println("원화 " + won + "원을 미국 달러로 환전시\n" + (int)Math.round(won / rate) + "dollar 입니다.");
		System.out.printf("원화 %d원을 미국 달러로 환전시\n%.0f달러입니다.", won, won/rate);
	}
}
