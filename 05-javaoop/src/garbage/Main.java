package garbage;

public class Main {
	public static void main(String[] args) {
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		//메모리 회수명령
		System.gc();
		Item i4 = new Item(4);
		i4 = null;
		i1 = null;
		Item i5 = new Item(5);
		System.gc();
		Item i6 = new Item(6);
		//i6 = null;
		//System.gc();
		
	}
}
