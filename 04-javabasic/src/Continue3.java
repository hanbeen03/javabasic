
public class Continue3 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 명칭으로 array를 만들어 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요.
		// 각 과목의 평균을 내되, 합격한 사람들의 평균만 내기 (합격은 60이상)
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		int total = 0;
		int count = 0;
		
		for(int a: math)
		{
			if( a >= 60 ) {
				total += a;
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println("수학평균 : " + (total/count));
		total = 0;
		count = 0;
		
		for(int b: eng)
		{
			if( b >= 60 ) {
				total += b;
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println("영어평균 : " + (total/count));
		total = 0;
		count = 0;
		
		for(int c: com)
		{
			if( c >= 60 ) {
				total += c;
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println("컴퓨터평균 : " + (total/count));
		total = 0;
		count = 0;
	}
}
