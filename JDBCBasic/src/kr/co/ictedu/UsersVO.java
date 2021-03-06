package kr.co.ictedu;

public class UsersVO {
	/*
	 * VO / DTO
	 * - VO클래스는 웹서버와 DB간의 데이터 송수신을 돕는
	 * 자바 클래스 파일입니다.
	 * 
	 * - VO클래스를 설계할 때는 DB테이블 컬럼 갯수만큼
	 * 1:1로 자료형, 이름 등이 매칭되는 멤버변수들을 선언합니다.
	 * 
	 * - VO클래스 내부 변수들은 private 접근 제한자를 걸어서
	 * 데이터 접근을 제어합니다.
	 * 
	 */
	private String id;
	private String pw;
	private String uname;
	private String email;
	
	public UsersVO() {
		
	}
	
	public UsersVO(String id, String pw, String uname, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.uname = uname;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Generate toString -> 그대로 생성
	@Override
	public String toString() {
		return "UsersVO [id=" + id + ", pw=" + pw + ", uname=" + uname + ", email=" + email + "]";
	}
	
	//생성자, Getters and Setters, toString
	
	// VO클래스는 기본 생성자와 모든 멤버변수를 초기화하는 생성자를 선언
	// Alt + Shift + S 혹은 우클릭 -> source
	// Generate Constructor Using Fields...
	
	// Getter와 Setter도 선언
}
