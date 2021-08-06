
public class Array {
	public static void main(String[] args) {
		//배열은 일반 변수와 달리 하나의 변수명에 여러 값을
		//입력할 수 있고 자료형에 []를 붙이는 것으로 선언합니다.
		//배열은 크기를 정해서 생성할 수도 있고, 정하지 않고 생성할수도
		//있는데, 설정된 크기 이상으로 자료를 넣을 수 없습니다.
		//배열의 크기(저장가능개수)는 "배열의 길이"라 표현합니다.
		//배열명.length를 이용해 배열크기를 알 수 있습니다.
		
		//배열의 선언1(길이 확정 X)
		int a[] = {1, 2, 3, 4}; //a는 정수 여러개를 담을 수 있다.
		System.out.println(a); //a변수에 1,2,3,4가 들어감
		//배열의 선언2(길이 확정 X)
		int[] b = {5, 6, 7, 8}; //b는 정수 여러개를 담을 수 있다.
		System.out.println(b); //5 6 7 8이 들어감
		
		//배열의 생성(길이 확정) // 전부 0으로 채워짐
		int[] c = new int[8];
		//int c[] = new int[8];
		System.out.println(c);
		
		//배열의 길이는 .length로 알 수 있습니다.
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
	}
}
