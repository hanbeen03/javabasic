package overloading;

public class Main2 {
	public static void main(String[] args) {
		
		OverTest a = new OverTest();
		a.showData();
		
		OverTest b = new OverTest("aaa");
		b.showData();
		
		OverTest c = new OverTest(99);
		c.showData();
		
		OverTest d = new OverTest("abc", 1500);
		d.showData();
	}
}
