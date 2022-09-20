package pattern;

public class PatternTriangle13 {
	 public static void main(String[] args) {
		    int rows = 5, k = 0;

		    for (int i = 1; i <= k; ++i, k = 0) {
		      for (int space = 1; space <= rows - i; ++space) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		    }
		  }
}
