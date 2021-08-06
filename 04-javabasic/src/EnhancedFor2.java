
public class EnhancedFor2 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 명칭으로 array를 만들어 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요.
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		//double[] avg = new double[3];
		//double mathAvg = 0;
		//double engAvg = 0;
		//double comAvg = 0;
		//double avg = 0;
		int total = 0;
//		int mathTotal = 0;
//		int engTotal = 0;
//		int comTotal = 0;
		//int[][] arr = {{0, 0}, {1, 1}};
//		
		/*
		for(int[] a: arr)
		{
			for(int b: a)
			{
				//System.out.println(b);
				//System.out.println(a.length);
				int[] c = a.clone();
				System.out.println(c.toString());
			}
		}
		*/
		
		for(int a: math)
		{
			total += a;
		}
		
		System.out.println("수학평균 : " + (int)total / math.length);
		total = 0;
				
		for(int b: eng)
		{
			total += b;
		}
		
		System.out.println("영어평균 : " + (int)total / eng.length);
		total = 0;
		
		for(int c: com)
		{
			total += c;
		}
	
		System.out.println("컴퓨터평균 : " + (int)total / com.length);
		total = 0;
		
		//mathAvg = mathTotal / math.length;
		//engAvg =  engTotal / eng.length;
		//comAvg = comTotal / com.length;
		
		
		
		//System.out.println("컴퓨터평균 : "+ (int)avg[2]);
		
		
	}
}
