package string1;

public class String8 {
	public static void main(String[] args) {
		//trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		//공백이 아닌 문자로 끈난 이후 지점의 모든 공백을 제거합니다.
		String str = "           Hello     Java             ";
		System.out.println(str.trim());
		
		
		//replace()를 이용해서 공백 전체를 없애보세요.
		String result = str.replace(" ", "");
		System.out.println(result);
		
		//trim()과 replace()를 이용해 Hello Java사이의 공백을 한 칸만 남겨보세요.
		//String result2 = str.trim();
		//System.out.println(result2);
		//result2 = result2.replace("  ", "");
		//System.out.println(result2);
		System.out.println(str.trim().replace("  ", ""));
	}
}
