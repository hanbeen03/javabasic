package interface1;

public class Main1 {

	public static void main(String[] args) {
		//자동차 생성 및 사용
		//생성시 Car타입 하나와
		//Vehicle타입 하나
		//이렇게 두 종을 만들어서 써보세요.
		
		Vehicle v = new Car("홍길동");
		Car c = new Car("이말년");
		/*
		v.accel();
		v.accel();
		v.accel();
		v.accel();
		v.showStatus();
		
		c.accel();
		c.accel();
		c.accel();
		c.accel();
		c.showStatus();
		*/
		
		Vehicle a = new SportsCar("홍길동");
		Vehicle b = new Motorbike("정채연");
		
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.accel();
		b.reFuel();
		b.reFuel();
		b.reFuel();
		b.reFuel();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.breakSpeed();
		b.showStatus();
	}

}
