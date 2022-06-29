package average;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = getFactorail(6);

		System.out.println("average :" + fact);
	}

	private static int getFactorail(int number) {
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		return fact;
	}
}
