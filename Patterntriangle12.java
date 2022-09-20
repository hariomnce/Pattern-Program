package pattern;

public class Patterntriangle12 {
	public static void main(String s[])
	{
		int i, j, k, l;

		l = 4;
		k = 1;
		for (i = 1; i <= l; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(k + "  ");
				k++;
			}
			System.out.println("");
		}
	}
}
