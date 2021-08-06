package exception3;

public class Exception3 {
	//다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을때
	//각각 예외유형을 다르게 처리할 때 사용합니다.
	//이 때 catch 구문을 여러 번 사용할 수 있습니다.
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5, 0};
		
		try {
			for(int i=0; i<6; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("이외의 예외가 발생했습니다.");
		}
	}
}
