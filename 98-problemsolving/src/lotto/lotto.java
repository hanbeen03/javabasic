package lotto;

import java.util.Arrays;

public class lotto {
	public static void main(String[] args) {
		int[] lottoNum = new int[6];
		int[] buyNum = new int[6];
		int count = 0;
		
		for(int i=0; i < lottoNum.length; i++) {
			lottoNum[i] = (int)(Math.random() * 45 + 1);
		}
		
		for(int j=0; j < lottoNum.length; j++) {
			for(int k=0; k< lottoNum.length; k++) {
				if(j == k)
					continue;
				
				if(lottoNum[j] == lottoNum[k]) {
					//count++;
					lottoNum[k] = (int)(Math.random() * 45 + 1);
				}
			}
		}
		
		//System.out.println(count);
		System.out.println(Arrays.toString(lottoNum));			
		
		while(true) {
			for(int a=0; a < buyNum.length; a++) {
				buyNum[a] = (int)(Math.random() * 45 + 1);
			}
			
			for(int b=0; b < buyNum.length; b++) {
				for(int c=0; c< buyNum.length; c++) {
					if(b == c)
						continue;
					
					if(buyNum[b] == buyNum[c]) {
						//count++;
						buyNum[c] = (int)(Math.random() * 45 + 1);
					}
				}
			}
			Arrays.sort(buyNum);
			Arrays.sort(lottoNum);
			
			System.out.println("뽑힌 번호 : " + Arrays.toString(buyNum));
			
			if((Arrays.toString(buyNum)).equals(Arrays.toString(lottoNum))) {
				System.out.println("추첨 번호 : " + Arrays.toString(lottoNum));
				System.out.println("당첨 번호 : " + Arrays.toString(buyNum));
				break;
			}
			
		}//while end
		
		
	}//main end
}
