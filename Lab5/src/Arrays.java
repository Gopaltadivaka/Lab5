
public class Arrays {
	public static int getTotal(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		return sum;

	}

	public static double getAverage(int array[]) {
		int sum = getTotal(array);
		double average = (double) sum / array.length;
		return average;
	}

	public static int getHighest(int array[]) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	public static int getLowest(int array[]) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Sum of Array" + getTotal(array));
		System.out.println("Average of Array" + getAverage(array));
		System.out.println("Highest of array" + getHighest(array));
		System.out.println("Minimum of Array" + getLowest(array));
	}
}
