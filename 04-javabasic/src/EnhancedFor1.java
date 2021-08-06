import java.util.Arrays;

public class EnhancedFor1 {
	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		int[] arr1 = {100, 211, 339, 475, 591};
		String[] arr2 = {"홍","길","동"};
		
		for(String b: arr2)
		{
			System.out.println(b);
		}
		
		for(int a: arr1) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
			
		System.out.println("-----------------");
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
