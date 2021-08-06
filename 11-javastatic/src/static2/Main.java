package static2;

public class Main {
	public static void main(String[] args) {
		//Asean조원 없이도 Asean 조별점수는 조회 가능
		//System.out.println(Asean.score);
		
		Asean a1 = new Asean(80, 70, 10);
		Asean a2 = new Asean(90, 90, 10);
		Asean a3 = new Asean(70, 80, 5);
		Asean a4 = new Asean(90, 100, 1);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
}
