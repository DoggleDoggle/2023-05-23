
public class MultiplicationTable {

	public static void main(String[] args) {

		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}

		int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%2d X %2d = %2d \t", i, j, i * j);
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
