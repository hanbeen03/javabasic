package inheritance;

public class Student extends Person{
	//공통속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의
	public String major;
	
	//학생버전의 자기소개
	public void getStudentInfo() {
		//상속받은 자식은 부모쪽 자원을 가져다 쓸 수 있다.
		getPersonInfo();
		System.out.println("전공은 " + major + "입니다.");
	}
}
