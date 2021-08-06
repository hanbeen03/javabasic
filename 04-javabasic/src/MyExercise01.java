
public class MyExercise01 {
	public static void main(String[] args) {
		// 1 6 10 13 15
		// 2 7 11 14
		// 3 8 12
		// 4 9 
		// 5
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 6-i; j++)
			{
				if(j==1)
					System.out.print(i + " ");
				if(j==2)
					System.out.print(i+5 + " ");
				else if(j==3)
					System.out.print(i+9 + " ");
				else if(j==4)
					System.out.print(i+12 + " ");
				else if(j==5)
					System.out.print(i+14 + " ");
				
			}
			System.out.println();
		}
	}
}
