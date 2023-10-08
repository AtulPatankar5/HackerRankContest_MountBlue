package Day1;

public class NumberLineJumps {

	public static void main(String[] args) {

		int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;
		String result = jumps(x1, v1, x2, v2);
		System.out.println(result);
	}

	private static String jumps(int x1, int v1, int x2, int v2) {
		if (x2 > x1 && v2 >= v1)
			return "NO";

		while (true) {
			if (x1 == x2) {
				return "YES";
			}
			x1 += v1;
			x2 += v2;
			if (x1 > x2)
				return "NO";
		}
	}

}
