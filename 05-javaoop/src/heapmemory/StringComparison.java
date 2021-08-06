package heapmemory;

public class StringComparison {
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		//System.out.println(str1);
		//System.out.println(str2);
		
		
//		String[] example = str1.split("o");
//		for(String a: example)
//		{
//			System.out.println(a);
//		}
		
		//System.out.println(str1.indexOf("ll"));
		//System.out.println(str1.indexOf('o'));
		
		
		//자바에서는 문자열의 일부 부분만 변경할 수 없다.
		//str1[1] = "a";
		
		//str1과 str2의 주소 비교를 위해서는 == 를 씁니다.
		//str1과 str2의 문자 비교를 위해서는 .equals()를 씁니다.
		//System.out.println(str1 == str2);
		//System.out.println(str1.equals(str2));
		
		
		//new 키워드로 생성시 내용이 같은 문자열도
		//별개의 공간에 저장됩니다.
		//String str3 = new String("Hello");
		//System.out.println(str1 == str3);
		//System.out.println(str1.equals(str3));
		
		String example = "123, 456, 789";
		
		String[] exampleArr = example.split(", ");
		
		for(String a : exampleArr)
		{
			System.out.println(a);
			System.out.println(a.indexOf('1'));
		}
	}
}
