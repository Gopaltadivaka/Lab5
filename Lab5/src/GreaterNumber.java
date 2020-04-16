
public class GreaterNumber {
	public static void print(int array[], int n) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > n)
				System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int n = 2;
		print(array, n);
	}
}
