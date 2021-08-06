package interface1;

public class SportsCar implements Vehicle{

	private int speed;
	private int fuel;
	private String owner;
	
	public SportsCar(String owner) {
		this.speed = 0;
		this.fuel = MAX_GAS;
		this.owner = owner;
	}
	
	@Override
	public void accel() {
		if(this.fuel - 5 < 0) {
			System.out.println("연료가 부족해 가속할 수 없습니다.");
			return;
		}
		
		if(this.speed + 20 > 350) {
			this.speed = 350;
			this.fuel -= 5;
			return;
		}
		
		this.speed += 20;
		this.fuel -= 5;
	}

	@Override
	public void breakSpeed() {
		if(this.speed - 30 < 0) {
			this.speed = 0;
		} else {
			this.speed -= 30;
		}
	}

	@Override
	public void reFuel() {
		if(this.fuel + 30 > MAX_GAS) {
			fuel = MAX_GAS;
		} else {
			fuel += 30;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + this.speed);
		System.out.println("현재 연료량 : " + this.fuel + " / " + MAX_GAS);
		System.out.println("차주 : " + this.owner);
	}
	
}
