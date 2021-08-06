package interface1;


//인터페이스를 구현(상속이 아님!)하기 위해서는
//implements(extends가 아님)키워드를 사용합니다.
//인터페이스 내부의 추상메서드는 무조건 구현해줘야 합니다.
public class Car implements Vehicle{
	//자동차라면 가져야 하는 변수 설정
	//현재속도, 현재연료량, 차주
	private int currentSpeed;
	private int currentFuel;
	private String owner;
	
	//생성자를 만들어주세요. 차주만 입력받고
	//나머지 요소는 현재 속도 0, 연료량 100을 자동 대입해줍니다.
	public Car (String owner) {
		this.currentSpeed = 0;
		this.currentFuel = MAX_GAS;
		this.owner = owner;
	}
	
	
	@Override
	public void accel() {
		//한 번 가속시 속도가 10씩 늘어나도록 해주세요.
		//연료는 한 번 가속에 1씩 소비합니다.
		//단 속도는 200을 초과할 수 없습니다.
		if(this.currentFuel - 1 < 0) {
			System.out.println("연료가 부족해 가속할 수 없습니다.");
			return;
		}
		
		if(this.currentSpeed + 10 > 200) {
			System.out.println("속도는 200을 초과할 수 없습니다.");
			this.currentSpeed = 200;
			this.currentFuel -= 1;
			return;
		}
		
		this.currentSpeed += 10;
		this.currentFuel -= 1;
		
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들게 해 주세요.
		
		if(this.currentSpeed - 10 < 0) {
			System.out.println("속도가 0입니다.");
			this.currentSpeed = 0;
		} else {
			this.currentSpeed -= 10;
		}
		
	}

	@Override
	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채워줍니다.
		// 단 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
		if(this.currentFuel + 30 > MAX_GAS) {
			System.out.println("연료가 가득 찼습니다.");
			this.currentFuel = MAX_GAS;
		} else {
			this.currentFuel += 30;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + this.currentSpeed);
		System.out.println("현재 연료량 : " + this.currentFuel + " / " + MAX_GAS);
		System.out.println("차주 : " + this.owner);
		
		
	}

	
}
