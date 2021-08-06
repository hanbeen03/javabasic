package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하는 반복 중지
		// 4. 3에서 일치하지 않으면 반복 회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		
		List<Integer> lottoNum = new ArrayList<>();
		List<Integer> pickNum = new ArrayList<>();
		Random r = new Random();
		int num;
		long countMoney = 0;
		
		for(int i=0; i < 6; i++) {
			num = r.nextInt(45) + 1;
			
			while(lottoNum.contains(num)) {
				num = r.nextInt(45) + 1;
			}
			
			lottoNum.add(i, num);
		}
		
		for(int i=0; i < 6; i++) {
			num = r.nextInt(45) + 1;
			
			while(pickNum.contains(num)) {
				num = r.nextInt(45) + 1;
			}
			
			pickNum.add(i, num);
		}
		
		//pickNum.removeAll(pickNum);
		//pickNum.clear();
		
		while(true) {
			
			for(int i=0; i < 6; i++) {
				num = r.nextInt(45) + 1;
				
				while(pickNum.contains(num)) {
					num = r.nextInt(45) + 1;
				}
				
				pickNum.set(i, num);
			}
			
			countMoney += 1000;
			
			Collections.sort(lottoNum);
			Collections.sort(pickNum);
			
			System.out.println("이번에 뽑힌 번호 : " + pickNum);
			
			if(lottoNum.equals(pickNum)) {
				System.out.println("추첨번호 : " + pickNum);
				System.out.println("당첨번호 : " + lottoNum);
				System.out.println("총 로또복권을 " + countMoney + "원 사고서야 1등에 당첨되었습니다.");
				break;
			}
		}

	}

}
