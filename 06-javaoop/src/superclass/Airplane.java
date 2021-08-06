package superclass;

public class Airplane {
	// 비행기는 속도를 가집니다.
	public int speed;
	
	//생성자는 속도를 입력한 값으로 맞춰줍니다.
	public Airplane(int speed) {
		this.speed = speed;
	}
	
	//fly()메서드를 수행하면 속도가 500씩 붙습니다.
	//단, 일반 비행기는 속도가 900이상이 될 수 없습니다.
	public void fly() {
		if( (speed + 500) > 900) {
			speed = 900;
			System.out.println("시속은 900km/h를 초과할 수 없음");
			System.out.println("시속 " + speed + "km/h로 비행중.");
		} else {
			speed += 500;
			System.out.println("시속 " + speed + "km/h로 비행중.");
		}
		
	}
	
	public void breakSpeed() {
		if( (speed - 100) < 0 ) {
			speed = 0;
			System.out.println("브레이크 동작 불가능");
			System.out.println("시속 " + speed + "km/h 입니다.");
		} else {
			speed -= 100;
			System.out.println("시속 " + speed + "km/h 입니다.");
		}
		
	}
}
