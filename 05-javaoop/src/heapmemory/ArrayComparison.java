package heapmemory;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
		
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		// 주소값이 아닌 전체 배열 데이터를 보고 싶다면
		// Arrays.toString(); 문법을 사용합니다.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
//		System.out.println(Arrays.toString(arr1));
//		
//		System.out.println(arr1 == arr2);
//		System.out.println(arr1 == arr3);
		
	}
}
