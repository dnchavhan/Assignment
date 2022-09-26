package Array;

public class AvgTwoConsNo {

	static void averageofTwoNo(int arr[], int n) {
		double sum = 0;
		for (int i = 0; i + 1 < n; i++) {

			sum = arr[i] + arr[i + 1];

			double avg = sum / 2;

			System.out.print(avg + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 13, 10, 15, 5, 8 };
		int n = arr.length;
		averageofTwoNo(arr, n);
	}
}