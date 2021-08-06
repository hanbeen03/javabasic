package math1;

public class Math6 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
		// 힌트) 조건식에 ||를 사용합니다
		
		
		String[] myRSP = {"가위", "바위", "보"};
		String[] comRSP = {"가위", "바위", "보"};
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3); 
		
		if(   (comRSP[comValue].equals("가위") && myRSP[myValue].equals("보"))
			|| (comRSP[comValue].equals("바위") && myRSP[myValue].equals("가위"))
			|| (comRSP[comValue].equals("보") && myRSP[myValue].equals("바위"))) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if ( (myRSP[myValue].equals("가위") && comRSP[comValue].equals("보"))
			|| (myRSP[myValue].equals("바위") && comRSP[comValue].equals("가위"))
			|| (myRSP[myValue].equals("보") && comRSP[comValue].equals("바위")) ) {
			System.out.println("당신이 이겼습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
		
		System.out.println("나 : " + myRSP[myValue]);
		System.out.println("컴퓨터 : " + comRSP[comValue]);

	}

}
