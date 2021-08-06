
public class LogicalOperator2 {
	public static void main(String[] args) {
		// &&,||는 short circuit(단축 검정) 연산자입니다.
		// &, |와 똑같이 작동하되,
		// 왼쪽 조건식만으로 최종 결과가 확정되는 경우
		// 추가연산을 수행하지 않습니다.
		System.out.println((1 + 3 > 4) && (0 < 3/0));
		System.out.println((5 > 4) || (0 < 2/0));
	}
}
