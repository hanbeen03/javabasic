package exception2;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatch2 {
	public static void main(String[] args) {
		//아까 exception1 패키지 내부의 여러 예외 유형 중
		//하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		//발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이를 입력해주세요 : ");
		int arrLength = sc.nextInt();
		
		int[] arr = new int[arrLength];
		
		
		try {
			for(int i = 0; i <= arr.length; i++) {
				arr[i] = i;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열 초기화 중 오류가 발생하였습니다.");
		} finally {
			System.out.println("코드의 마지막입니다.");
		}
		
	}
}
