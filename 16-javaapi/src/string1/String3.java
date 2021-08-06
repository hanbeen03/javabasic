package string1;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		//Scanner를 통해서 전체 문장을 입력받으세요.
		//다음으로 문장내에서 찾고 싶은 단어를 입력받으세요.
		//문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		//출력해주는 코드를 작성해보세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String all = sc.nextLine();
		
		System.out.println("문장 내에서 카운트할 단어를 입력해주세요.");
		String voca = sc.nextLine();
		int count = 0;
		//int a = 0;
		
		for(int i=0; i < all.length(); i++) {
			if(all.indexOf(voca) == -1) {
				System.out.println("없는 단어입니다.");
				break;
			}  else if (all.indexOf(voca, i) == i){
				count++;
				//a++;
				System.out.println(i + "번에서 " + count + "번째 " + voca + "이(가) 검출되었습니다." );
			}
		}
		System.out.println(voca + "의 총 출현 횟수는 " + count + "회입니다.");
	}

}
