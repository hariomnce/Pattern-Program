package pattern;

public class PatternTriangle11 {
	public static void main(String args[])
	{

		int n = 5, i, j, num = 1, space;
		space = n - 1;

		for ( j = 1 ; j <= n ; j++ )
		{
			num = j;
			for ( i = 1 ; i <= space ; i++ )
				System.out.print(" ");

			space --;

			for ( i = 1 ; i <= j ; i++ )
			{
				System.out.print(num);
				num++;
			}
			num--;
			num--;
			for ( i = 1 ; i < j ; i++)
			{
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}
}
