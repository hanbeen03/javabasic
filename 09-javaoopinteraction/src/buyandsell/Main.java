package buyandsell;

public class Main {

	public static void main(String[] args) {
		Buyer b = new Buyer(0);
		Seller s = new Seller(1000);
		
		
		//b.showBuyer();
		//b.buyMango(5, s);
		//b.showBuyer();
		//b.buyMango(3, s);
		//b.showBuyer();
		//b.buyMango(10, s);
		//b.showBuyer();
		b.buyMango(1000, s);
		//b.showBuyer();
		//s.showSeller();
		
		
		/*
		b.buyMango(1000, s);
		b.showBuyer();
		s.showSeller();
		*/
		
		/*
		Seller s = new Seller(20);
		
		s.showSeller();
		s.sellMango(5);
		s.showSeller();		
		s.sellMango(10);
		s.showSeller();
		s.sellMango(6);
		s.showSeller();
		*/

	}

}
