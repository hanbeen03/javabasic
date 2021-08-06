package interface1;

public class Motorbike implements Vehicle {
	private int speed;
	private int fuel;
	private String owner;
	
	//생성자를 만들어주세요. 차주만 입력받고
	//나머지 요소는 현재 속도 0, 연료량 100을 자동 대입해줍니다.
	public Motorbike (String owner) {
		this.speed = 0;
		this.fuel = MAX_GAS;
		this.owner = owner;
	}
	
	
	@Override
	public void accel() {
		//한 번 가속시 속도가 10씩 늘어나도록 해주세요.
		//연료는 한 번 가속에 1씩 소비합니다.
		//단 속도는 200을 초과할 수 없습니다.
		if(this.fuel - 10 < 0) {
			System.out.println("연료가 부족해 가속할 수 없습니다.");
			return;
		}
		
		if(this.speed + 30 > 250) {
			System.out.println("속도는 250을 초과할 수 없습니다.");
			this.speed = 250;
			this.fuel -= 10;
			return;
		}
		
		this.speed += 30;
		this.fuel -= 10;
		
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들게 해 주세요.
		
		if(this.speed - 20 < 0) {
			System.out.println("속도가 0입니다.");
			this.speed = 0;
		} else {
			this.speed -= 20;
		}
		
	}

	@Override
	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채워줍니다.
		// 단 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
		if(this.fuel + 20 > MAX_GAS) {
			System.out.println("연료가 가득 찼습니다.");
			this.fuel = MAX_GAS;
		} else {
			this.fuel += 20;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + this.speed);
		System.out.println("현재 연료량 : " + this.fuel + " / " + MAX_GAS);
		System.out.println("차주 : " + this.owner);
		
	}
}
