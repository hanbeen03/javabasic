
public class Bonus {
	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 15; i++)
		{
			for(int j = 1; j <= 12; j++)
			{
				if( ((i*4) + (j*5)) == 60)
				{
					System.out.println("x의 해 : " + i);
					System.out.println("y의 해 : " + j);
					System.out.println("--------------");
				}
			}
		}
		
		
	}
}
