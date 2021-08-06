package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// 여러분들이 직접 String 자료를 가변적으로 받을 수 있는
		// ArrayList를 만들어주시고 안쪽에 자료로
		// "사과", "딸기", "바나나", "블루베리", "파인애플"을 넣어주세요.
		
		List<String> list = new ArrayList<>();
		
		list.add("사과");
		list.add("바나나");
		list.add(1, "딸기");
		list.add("블루베리");
		list.add("수박");
		list.set(4, "파인애플");
		System.out.println(list);
		
		// .contains("자료") 는 리스트 내에 찾는 자료가 있다면 true
		// 없다면 false를 출력해준다.
		System.out.println(list.contains("사과"));
		System.out.println(list.contains("복숭아"));
		
		// .get(번호)는 주어진 인덱스에 저장되어 있는 자료를 조회해줍니다.
		System.out.println(list.get(2));
		// 없는 인덱스번호를 입력하면 예외가 발생해 전체 코드가 종료됩니다.
		//System.out.println(list.get(10));
		
		List<String> list2 = new ArrayList<>(); //빈 리스트 생성
		// .isEmpty() 는 비어있는지 여부를 체크합니다.
		System.out.println(list.isEmpty());
		System.out.println(list2.isEmpty());
		
		// .size()는 내부 요소의 개수를 확인합니다.
		System.out.println(list.size());
		System.out.println(list2.size());

	}

}
