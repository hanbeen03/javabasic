package collection1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// LinkedList는 자료의 변경이 빈번할 때 사용하면 성능 향상이 있습니다.
		// 일반적인 상황에서는 ArrayList를 더 많이 쓰고,
		// 양 리스트 간 사용법에는 큰 차이가 없습니다.
		List<String> list1 = new LinkedList<>();
		

		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		list1.add("스프링");
		System.out.println(list1);
		
		// .remove()는 두 유형이 있습니다.
		// .remove(번호)를 넣을 경우 주어진 번호에 있는 자료가 삭제되고
		// .remove("자료")를 입력하면 번호와 상관없이 자료가 삭제됩니다.
		list1.remove(0); // 0번 인덱스 "자바" 삭제
		System.out.println(list1);
		list1.remove("스프링"); //"스프링" 자료 삭제
		System.out.println(list1);
		
		// 리스트를 전체적으로 비우고 싶을 때는 ????를 사용합니다.
		//list1.removeAll(list1);
		list1.clear();
		System.out.println(list1);
		
		
		//4개 자료 아무거나 추가하기
		list1.add("검사");
		list1.add(1, "격사");
		list1.add("기공사");
		list1.add("역사");
		System.out.println(list1);
		
		// 자료 정렬은 Collections.sort(정렬대상) 입니다.
		Collections.sort(list1);
		System.out.println(list1);
	}

}
