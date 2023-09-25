package assistedPracticeProject4;

import java.util.Arrays;

public class InsertionSortAlgo {

	public static void main(String[] args) {
		int[] arr = {54,15,48,68,25,23,75};

		System.out.println("GIVEN ARRAY : " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("SORTED ARRAY : " + Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int j = i - 1;

			while (j>-1 && temp < arr[j]) {
				// swap 
				arr[j+1]=arr[j];
				arr[j] = temp;
				j--;
			}

		}
	}
}