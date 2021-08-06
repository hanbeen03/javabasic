
public class Binary4 {
	public static void main(String[] args) {
		// 비트 이동 연산자는 숫사 >>, << 자리수 문법으로
		// 꺽쇠의 방향이 << 경우는 왼쪽으로
		// 입력된 자리수만큼 밀어줍니다.
		// 이때 정수 숫자는 2의 자리수 제곱만큼 증가합니다.
		// 반대방향인 경우는 2의 자리수 제곱만큼
		// 크기가 줄어듭니다.
		int a = 80;
		System.out.println(a >> 3);
		System.out.println(a << 3);
	}
}
