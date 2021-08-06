package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {
	// 로또복권 추첨기를 만들어보겠습니다.
	// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
	// 6개의 숫자를 뽑습니다.
	// 순서를 정렬해서 출력하도록 만들어주세요.
	// ArrayList의 정렬은 .sort() 대신
	// Collections.sort(리스트); 를 이용해 정렬합니다.
	public static void main(String[] args) {
		List<Integer> lottoNum = new ArrayList<>();
		Random r = new Random();
		int second;
		int num;
		
		for(int i=0; i < 6; i++) {
			num = r.nextInt(45) + 1;
			
			while(lottoNum.contains(num)) {
				num = r.nextInt(45) + 1;
			}
			
//			
//			if(lottoNum.contains(num)) {
//				num = r.nextInt(45) + 1;
//				lottoNum.add(i, num);
//			} else
			
			lottoNum.add(i, num);
		}
		
		num = r.nextInt(45) + 1;
		
		while(lottoNum.contains(num)) {
			num = r.nextInt(45) + 1;
		}
		
		second = num;
		
		/*
		if(lottoNum.contains(num)) {
			second = r.nextInt(45) + 1;
		} else {
			second = num;
		}
		*/
		
		Collections.sort(lottoNum);
		
		System.out.println("추첨된 번호 : " + lottoNum);
		System.out.println("2등당첨번호 : " + second         );
		
		
		
	}
}
