
public class MakePyramid {
	public static void main(String[] args) {
		for(int i=0; i < 6; i++)
		{
			for(int k = 0; k < 6-(i+1); k++)
			{
				System.out.print(" ");				
			}
			for(int j=0; j < i * 2 + 1; j++ )
			{
				System.out.printf("*");
			}
			System.out.println();
		}
		
		for(int i=0; i < 5; i++)
		{
			for(int k=0; k < i + 1; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j < 9 - (i * 2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
