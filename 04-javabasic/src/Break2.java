
public class Break2 {
	public static void main(String[] args) {
		// 중첩반복문 사용시 전체 다 종료가 아닌
		// 내부 반복문만 종료하는 예시
		//구구단 출력, 단 n * 5까지만 출력하는 예시
		for(int i = 2; i <= 9; i++)
		{
			System.out.println(i + "단 출력.");
			for(int j=1; j <= 9; j++)
			{
				if(j > 5) {
					System.out.println("*6이상은 직접 알아보기.");
					break;
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println("----------------");
		}
	}
}
