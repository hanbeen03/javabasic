package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		
		menu.put("김치찌개", 6000);
		menu.put("된장찌개", 6000);
		menu.put("닭도리탕", 9000);
		menu.put("낙지덮밥", 8000);
		menu.put("라면", 4500);
		
		System.out.println(menu.get("낙지덮밥"));
		System.out.println(menu.get("닭도리탕"));
		System.out.println(menu.get("라면"));
		System.out.println(menu);

	}

}
