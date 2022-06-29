package average;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;

		float average = getAverage(number);

		System.out.println("average :" + average);
	}

	private static float getAverage(int number) {
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			//sum += i;
			sum = sum + i;
		}

		float average = sum / number;
		return average;
	}

}
