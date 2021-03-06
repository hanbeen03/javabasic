package accessmodifier3;

public class Main2 {
	public static void main(String[] args) {
		// 다른 패키지에서 상속받은 Child2를 확인해보겠습니다.
		Child2 child2 = new Child2();
		
		//1.public 접근
		//System.out.println(child2.a);
		//1-2. child2내부의 e값 변경 및 접근
		//child2.e = 100;
		//System.out.println(child2.e);
		
		//2.protected 접근
		//protected는 같은 패키지, 혹은 다른 패키지라면
		//상속 관계일때 접근 가능
		//System.out.println(child2.b);
		//child2.getB();
		
		//3.private 접근
		//4.default 접근(패키지가 같으면 접근 가능)
		//System.out.println(child2.d);
//		child2.setB(-1);
//		child2.getB();
//		child2.setB(0);
//		child2.getB();
//		child2.setB(7);
//		child2.getB();
		
		
		child2.setB(100);
		System.out.println(child2.getBInt());
		child2.setB(50);
		System.out.println(child2.getBInt());
		
	}
}
