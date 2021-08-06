package static2;

public class Asean {
	//중간고사, 기말고사, 출석, 조별과제 점수를 변수로 정의해주세요.
	//단, 조별과제는 모든 객체가 공유하는 점수이며
	//나머지는 개별 객체가 가지는 변수입니다.
	private int midTerm;
	private int finalTerm;
	private int attendance;
	
	
	//public시 일반 메서드에서 score 조회 가능
	//private시 static 메서드에서만 조회 가능
	private static int score = 20;
	
	//생성자는 객체 생성시 중간고사, 기말고사, 출석점수를 받습니다.
	public Asean (int midTerm, int finalTerm, int attendance) {
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		this.attendance = attendance;
	}
	
	// showAseanInfo()를 정의해주세요
	// 이 메서드는 중간고사, 기말고사, 출결, 조별과제 성적을
	// 콘솔에 출력합니다.
	public void showAseanInfo() {
		System.out.println("중간고사 : " + this.midTerm);
		System.out.println("기말고사 : " + this.finalTerm);
		System.out.println("출석 : " + this.attendance);
		System.out.println("조별과제 : " + score);
	}
	
	//Main.java를 생성해주시고 메인메서드 내부에 구성원을 최소 4인으로
	//만들어주세요.
}
