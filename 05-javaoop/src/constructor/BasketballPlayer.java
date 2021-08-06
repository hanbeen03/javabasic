package constructor;

public class BasketballPlayer {
	public int height;
	public int jumpPower;
	
	public BasketballPlayer(int height, int jumpPower) {
		this.height = height;
		this.jumpPower = jumpPower;
	}
	
	public void dunkShoot() {
		if(height + jumpPower >= 300)
			System.out.println("덩크슛에 성공했습니다.");
		else
			System.out.println("골대에 닿지 않았습니다.");
	}
}
